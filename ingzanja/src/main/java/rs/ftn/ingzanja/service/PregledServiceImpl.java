package rs.ftn.ingzanja.service;

import com.ugos.jiprolog.engine.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.ftn.ingzanja.dto.PregledDTO;
import rs.ftn.ingzanja.model.*;
import rs.ftn.ingzanja.repository.*;

import java.util.*;

@Service
public class PregledServiceImpl implements PregledService {

    @Autowired
    PregledRepository repository;

    @Autowired
    PacientRepository pacientRepo;

    @Autowired
    SymptomsRepository symptomRepo;

    @Autowired
    DijagnostikaRepository dijagnostikaRepository;

    @Autowired
    BolestRepository bolestRepository;

    @Autowired
    TerapijaRepository terapijaRepository;

    @Override
    public void savePregledOnly(Pregled p, PregledDTO body) {

        Set<Simptom> simptoms = new HashSet<>();
        if(body.getSimptoms() != null) {
            for (String s : body.getSimptoms()) {
                Simptom simptom = symptomRepo.findOneByNaziv(s);
                if (simptom != null)
                    simptoms.add(simptom);
            }
            p.setSimptoms(simptoms);
        }
        repository.save(p);

    }

    @Override
    public Long savePregled(Pregled p, Long id) {
        Pacient pacijent = pacientRepo.findOneById(id);
        if(p == null)
            return null;

        p.setPacient(pacijent);
        Pregled saved = repository.save(p);
        return saved.getId();
    }

    @Override
    public Pregled findPregledById(Long id) {
        return repository.findOneById(id);
    }

    @Override
    public void saveSimptoms(List<String> simptoms, Pregled pregled) {
        Set<Simptom> simptoms1=new HashSet<>();
        if(simptoms.size() != 0){
            for(String s: simptoms){
                Simptom simptom=symptomRepo.findOneByNaziv(s);
                if(simptom != null){
                    simptoms1.add(simptom);
                }
            }
            pregled.setSimptoms(simptoms1);
        }

        repository.save(pregled);
    }

    @Override
    public void saveDijagnostika(String dijagnostika, Pregled pregled) {

        Dijagnostika dijagnostika1=dijagnostikaRepository.findOneByNaziv(dijagnostika);
        pregled.setDijagnostika(dijagnostika1);
        repository.save(pregled);
    }

    @Override
    public void saveDijagnozu(String dijagnoza, Pregled pregled) {
        Bolest bolest=bolestRepository.findOneByNaziv(dijagnoza);
        pregled.setDijagnoza(bolest);
        repository.save(pregled);

    }

    @Override
    public void saveTerapiju(String terapija, Pregled pregled) {
        Terapija terapija1=terapijaRepository.findOneByNaziv(terapija);
        pregled.setTerapija(terapija1);
        pregled.setComplet(true);
        repository.save(pregled);
    }

    @Override
    public HashMap<String,Float> makeSetOfBolest(int katGod, String pol, String rasaS, int katWeight, int katAlc, int katSmoke){
        List<Bolest> bolesti=bolestRepository.findAll();
        HashMap<String,Float> retVal=new HashMap<>();
        JIPEngine engine=new JIPEngine();

        for(Bolest bolest:bolesti){
            retVal.put(bolest.getNaziv(), (float) 0);
        }

        for(String key: retVal.keySet()){
            //koefPrev(2,male,white,2,0,1,heart_attack, KOEF).
            String upit="koefPrev("+katGod+", "+pol+", "+rasaS+", "+katWeight+", "+katAlc+", "+katSmoke+", "+key+", KOEF).";


            try{

                engine.consultFile("/src/program.pl");
                JIPTermParser parser=engine.getTermParser();
                JIPTerm term=parser.parseTerm(upit);
                JIPQuery query=engine.openSynchronousQuery(term);

                JIPTerm solution;

                while((solution=query.nextSolution()) !=null) {

                    //ako ima vise varijabli koje su deo upta
                    for(JIPVariable var: solution.getVariables()) {
                        System.out.println(var.getName()+ "="+var.getValue());
                        retVal.put(key,Float.parseFloat(var.getValue().toString()));
                    }
                }

            }catch (Exception e){
                e.printStackTrace();
            }

        }

        return retVal;
    }
}
