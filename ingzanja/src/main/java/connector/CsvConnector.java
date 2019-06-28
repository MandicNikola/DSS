package connector;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import rs.ftn.ingzanja.model.CBRModel;
import rs.ftn.ingzanja.model.Pregled;
import rs.ftn.ingzanja.model.Simptom;
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

        List<CBRModel> modeli = new ArrayList<>();

        //popuni cbrmodel pregledima iz baze
        for(int i = 0 ; i < pregledi.size(); i++) {

            Pregled p = pregledi.get(i);
            for(Simptom s : p.getSimptoms())
            {
                CBRModel cbrm= new CBRModel();
                cbrm.setDijagnoza(p.getDijagnoza().getNaziv());
                cbrm.setTerapija(p.getTerapija().getNaziv());
                cbrm.setDijagnostika(p.getDijagnostika().getNaziv());
                cbrm.setSimptom(s.getNaziv());
                cbrm.setId(p.getId());
                modeli.add(cbrm);
            }
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
