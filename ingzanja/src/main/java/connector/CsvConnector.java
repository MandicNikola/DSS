package connector;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import rs.ftn.ingzanja.model.CBRModel;
import rs.ftn.ingzanja.model.Pregled;
import rs.ftn.ingzanja.repository.PregledRepository;
import ucm.gaia.jcolibri.cbrcore.CBRCase;
import ucm.gaia.jcolibri.cbrcore.CaseBaseFilter;
import ucm.gaia.jcolibri.cbrcore.Connector;
import ucm.gaia.jcolibri.exception.InitializingException;
import ucm.gaia.jcolibri.util.FileIO;



public class CsvConnector implements Connector {

    private  List<Pregled> pregledi  = new ArrayList<>();

    public CsvConnector(List<Pregled> pregleds){
        this.pregledi = pregleds;
    }

    @Override
    public Collection<CBRCase> retrieveAllCases() {



        LinkedList<CBRCase> cases = new LinkedList<CBRCase>();
        System.out.println(pregledi.size());

        List<CBRModel> modeli = new ArrayList<>();



        //popuni cbrmodel pregledima iz baze
        for(Pregled p : pregledi) {
            CBRModel cbrm= new CBRModel();

            cbrm.setDijagnoza(p.getDijagnoza().getNaziv());
            cbrm.setSimptomi(p.getSimptoms());
            cbrm.setTerapija(p.getTerapija().getNaziv());
            cbrm.setDijagnostika(p.getDijagnostika());

            modeli.add(cbrm);

        }
        //popuni case
        for(CBRModel m : modeli) {
            CBRCase cbrCase = new CBRCase();
            cbrCase.setDescription(m);
            cases.add(cbrCase);

        }

        return cases;



    }


    @Override
    public Collection<CBRCase> retrieveSomeCases(CaseBaseFilter arg0) {
        return null;
    }

    @Override
    public void storeCases(Collection<CBRCase> arg0) {
    }

    @Override
    public void close() {
    }

    @Override
    public void deleteCases(Collection<CBRCase> arg0) {
    }

    @Override
    public void initFromXMLfile(URL arg0) throws InitializingException {
    }

}
