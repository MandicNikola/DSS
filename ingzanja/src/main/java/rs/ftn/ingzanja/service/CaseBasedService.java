package rs.ftn.ingzanja.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.io.IOException;

import org.springframework.stereotype.Service;



import connector.CbrApplication;
import ucm.gaia.jcolibri.method.retrieve.selection.SelectCases;
import ucm.gaia.jcolibri.method.retrieve.RetrievalResult;
import rs.ftn.ingzanja.model.*;
import rs.ftn.ingzanja.dto.CBRDTO;

@Service
public class CaseBasedService {
    //ispis na gui(?)

    public List<CBRDTO> getMatches(CBRModel cbr){

        CbrApplication cbrapp = new CbrApplication();

        Collection<RetrievalResult> eval = cbrapp.evaluate(cbr);

        eval = SelectCases.selectTopKRR(eval, 5);


        ArrayList<CBRDTO> rezultati = new ArrayList<CBRDTO>();

        for(RetrievalResult rr : eval) {

            if(rr.getEval() >0) {

                CBRDTO novi= new CBRDTO();

                novi.setDijagnoza(((CBRModel) rr.get_case().getDescription()).getDijagnoza());
                novi.setTerapija(((CBRModel) rr.get_case().getDescription()).getTerapija());
                //novi.setSimptomi(((CBRModel) rr.get_case().getDescription().getSimptomi());
                rezultati.add(novi);
            }
            else {

                System.out.println("eval prazan?");
            }


        }

        return rezultati;
    }

}
