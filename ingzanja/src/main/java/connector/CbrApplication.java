package connector;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import rs.ftn.ingzanja.model.CBRModel;

//import connector.CsvConnector;

import ucm.gaia.jcolibri.casebase.LinealCaseBase;
import ucm.gaia.jcolibri.cbraplications.StandardCBRApplication;
import ucm.gaia.jcolibri.cbrcore.Attribute;
import ucm.gaia.jcolibri.cbrcore.CBRCase;
import ucm.gaia.jcolibri.cbrcore.CBRCaseBase;
import ucm.gaia.jcolibri.cbrcore.CBRQuery;
import ucm.gaia.jcolibri.cbrcore.CaseBaseFilter;
import ucm.gaia.jcolibri.cbrcore.CaseComponent;
import ucm.gaia.jcolibri.cbrcore.Connector;
import ucm.gaia.jcolibri.connector.PlainTextConnector;
import ucm.gaia.jcolibri.exception.ExecutionException;
import ucm.gaia.jcolibri.exception.InitializingException;
import ucm.gaia.jcolibri.extensions.recommendation.casesDisplay.UserChoice;
import ucm.gaia.jcolibri.extensions.recommendation.conditionals.BuyOrQuit;
import ucm.gaia.jcolibri.extensions.recommendation.conditionals.ContinueOrFinish;
import ucm.gaia.jcolibri.extensions.recommendation.navigationByProposing.CriticalUserChoice;
import ucm.gaia.jcolibri.extensions.recommendation.navigationByProposing.CritiqueOption;
import ucm.gaia.jcolibri.extensions.recommendation.navigationByProposing.DisplayCasesTableWithCritiquesMethod;
import ucm.gaia.jcolibri.extensions.recommendation.navigationByProposing.queryElicitation.MoreLikeThis;
import ucm.gaia.jcolibri.method.gui.formFilling.ObtainQueryWithFormMethod;
import ucm.gaia.jcolibri.method.retrieve.RetrievalResult;
import ucm.gaia.jcolibri.method.retrieve.FilterBasedRetrieval.FilterBasedRetrievalMethod;
import ucm.gaia.jcolibri.method.retrieve.FilterBasedRetrieval.FilterConfig;
import ucm.gaia.jcolibri.method.retrieve.FilterBasedRetrieval.predicates.NotEqual;
import ucm.gaia.jcolibri.method.retrieve.FilterBasedRetrieval.predicates.QueryLess;
import ucm.gaia.jcolibri.method.retrieve.FilterBasedRetrieval.predicates.QueryMore;
import ucm.gaia.jcolibri.method.retrieve.NNretrieval.NNConfig;
import ucm.gaia.jcolibri.method.retrieve.NNretrieval.NNScoringMethod;
import ucm.gaia.jcolibri.method.retrieve.NNretrieval.similarity.global.Average;
import ucm.gaia.jcolibri.method.retrieve.NNretrieval.similarity.local.Equal;
import ucm.gaia.jcolibri.method.retrieve.NNretrieval.similarity.local.Interval;
import ucm.gaia.jcolibri.method.retrieve.NNretrieval.similarity.local.Table;
import ucm.gaia.jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold;
import ucm.gaia.jcolibri.method.retrieve.NNretrieval.similarity.local.recommenders.InrecaLessIsBetter;
import ucm.gaia.jcolibri.method.retrieve.NNretrieval.similarity.local.recommenders.InrecaMoreIsBetter;
import ucm.gaia.jcolibri.method.retrieve.selection.SelectCases;
import ucm.gaia.jcolibri.util.FileIO;


public class  CbrApplication implements StandardCBRApplication {

    Connector _connector;  /** Connector object */
    CBRCaseBase _caseBase;  /** CaseBase object */

    static Collection<RetrievalResult> requestResults;

    NNConfig simConfig;  /** KNN configuration */

    public void configure() throws ExecutionException {
        _connector =  new CsvConnector();

        _caseBase = new LinealCaseBase();  // Create a Lineal case base for in-memory organization

        simConfig = new NNConfig(); // KNN configuration
        simConfig.setDescriptionSimFunction(new Average());  // global similarity function = average

        //definise se na osnovu cega se porede slucajevi
        simConfig.addMapping(new Attribute("pol", CBRModel.class),  new Equal());
        simConfig.addMapping(new Attribute("godine", CBRModel.class),  new Equal());
        simConfig.addMapping(new Attribute("simptomi", CBRModel.class),  new Equal());

        // simConfig.addMapping(new Attribute("attribute", CaseDescription.class), new Interval(5));
        // TODO

        // Equal - returns 1 if both individuals are equal, otherwise returns 0
        // Interval - returns the similarity of two number inside an interval: sim(x,y) = 1-(|x-y|/interval)
        // Threshold - returns 1 if the difference between two numbers is less than a threshold, 0 in the other case
        // EqualsStringIgnoreCase - returns 1 if both String are the same despite case letters, 0 in the other case
        // MaxString - returns a similarity value depending of the biggest substring that belong to both strings
        // EnumDistance - returns the similarity of two enum values as the their distance: sim(x,y) = |ord(x) - ord(y)|
        // EnumCyclicDistance - computes the similarity between two enum values as their cyclic distance
        // Table - uses a table to obtain the similarity between two values. Allowed values are Strings or Enums. The table is read from a text file.
        // TableSimilarity(List<String> values).setSimilarity(value1,value2,similarity)
    }

    public CbrApplication() {


        super();
        try {
            this.configure();
            this.preCycle();
        } catch(ExecutionException e) {
            e.printStackTrace();
            System.out.println("Greska u cbrapp klasi");
        }
    }

    public void cycle(CBRQuery query) throws ExecutionException {
        Collection<RetrievalResult> eval = NNScoringMethod.evaluateSimilarity(_caseBase.getCases(), query, simConfig);
        eval = SelectCases.selectTopKRR(eval, 5);
        System.out.println("Retrieved cases:");
        requestResults = eval;
    }

    public void postCycle() throws ExecutionException {

    }

    public CBRCaseBase preCycle() throws ExecutionException {
        _caseBase.init(_connector);
		/*java.util.Collection<CBRCase> cases = _caseBase.getCases();
		for (CBRCase c: cases)
			System.out.println(c.getDescription());*/
        return _caseBase;
    }

    /*public static void main(String[] args) {
        StandardCBRApplication recommender = new CbrApplication();
        try {
            recommender.configure();

            recommender.preCycle();

            CBRQuery query = new CBRQuery();


            recommender.cycle(query);

            recommender.postCycle();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    */
    public Collection<RetrievalResult> evaluate(CBRModel cbr){
        try {
            CBRQuery query = new CBRQuery();

            query.setDescription(cbr);
            cycle(query);

            return requestResults;

        } catch(Exception e){
            e.printStackTrace();
            return null;
        }





    }

}
