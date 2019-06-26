package rs.ftn.ingzanja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.ftn.ingzanja.model.*;
import rs.ftn.ingzanja.repository.BolestRepository;
import rs.ftn.ingzanja.repository.PacientRepository;
import rs.ftn.ingzanja.repository.PreventivniPregledRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.ugos.jiprolog.engine.*;

@Service
public class PreventivniPregledServiceImpl implements PreventivniPregledService {

    @Autowired
    PreventivniPregledRepository preventivniPregledRepository;

    @Autowired
    PacientRepository pacientRepository;

    @Autowired
    BolestRepository bolestRepository;

    @Override
    public Long saveOnePP(PreventivniPregled pp,Long id) {
        if(pp!=null){
            preventivniPregledRepository.save(pp);
            return id;
        }else{
            return Long.valueOf(-1);
        }
    }

    @Override
    public Long savePreventivniPregled(PreventivniPregled pp, Long id) {
        Pacient pacijent = pacientRepository.findOneById(id);
        if(pp == null)
            return null;

        pp.setPacientPP(pacijent);
        PreventivniPregled saved = preventivniPregledRepository.save(pp);
        return saved.getId();
    }

    @Override
    public PreventivniPregled findPreventivniPregledById(Long id) {
        return preventivniPregledRepository.findOneById(id);
    }

    @Override
    public List<PreventivniPregled> findAll() {
        return this.preventivniPregledRepository.findAll();
    }

    @Override
    public List<String> prevDiagnostics(PreventivniPregled pp) {
        Pacient pac=pp.getPacientPP();

        List<String> dijagnostike=new ArrayList<>();
        HashMap<String,Float> bolesti=new HashMap<>();
        for(Bolest b:pac.getPorodicneBolesti()){
            bolesti.put(b.getNaziv(), (float) 1);
        }

        for(Bolest b:pac.getIstorijaBolesti()){
            if(!bolesti.containsKey(b.getNaziv())){
                bolesti.put(b.getNaziv(), (float) 1);
            }
        }

        if(bolesti.size()==0) {
            List<Bolest> bol = bolestRepository.findAll();
            for (Bolest b : bol) {
                bolesti.put(b.getNaziv(),(float) 1);
            }
        }

            dijagnostike=analiza(bolesti,pac);

        return dijagnostike;
    }


    public List<String> analiza(HashMap<String,Float> bolesti,Pacient pacient){

        List<String> ret=new ArrayList<>();
        //PAZITI NA ENUME
        Race rasa = pacient.getRasa();
        Pol pol = pacient.getPol();
        boolean alc= pacient.isAlkohol();
        boolean smoke=pacient.isPusac();
        int godiste = pacient.getGodiste();
        String debljina=pacient.getDebljina();
        godiste=2019-godiste;
        String rasaS;
        String polS;
        int katGod;
        int katAlc;
        int katSmoke;
        int katWeight;

        if(pol.equals(Pol.male)){
            polS="male";
        }else{
            polS="female";
        }

        if(rasa.equals(Race.black)){
            rasaS="black";
        } else if (rasa.equals(Race.white)) {
            rasaS="white";
        }else{
            rasaS="hispanic";
        }

        if(godiste <= 20){
            katGod=0;
        }else if(godiste>20 && godiste<=40){
            katGod=1;
        }else if(godiste>40 && godiste <=60){
            katGod=2;
        }else{
            katGod=3;
        }

        if(debljina.equals("skinny")){
            katWeight=0;
        }else if(debljina.equals("normal")){
            katWeight=1;
        }else{
            katWeight=3;
        }

        if(alc){
            katAlc=1;
        }else{
            katAlc=0;
        }

        if(smoke){
            katSmoke=1;
        }else{
            katSmoke=0;
        }

        JIPEngine engine=new JIPEngine();
        for(String key: bolesti.keySet()){
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
                        bolesti.put(key,Float.parseFloat(var.getValue().toString()));
                    }
                }

            }catch (Exception e){
                e.printStackTrace();
            }

        }

        String tkey="";
        float val=0;
        for(String key:bolesti.keySet()){
            if(bolesti.get(key)>val){
                tkey=key;
                val=bolesti.get(key);
            }
        }

        String upit2="test_for_disease("+tkey+", X).";
        try{

            engine.consultFile("/src/program.pl");
            JIPTermParser parser=engine.getTermParser();
            JIPTerm term=parser.parseTerm(upit2);
            JIPQuery query=engine.openSynchronousQuery(term);

            JIPTerm solution;

            while((solution=query.nextSolution()) !=null) {

                //ako ima vise varijabli koje su deo upta
                for(JIPVariable var: solution.getVariables()) {
                    System.out.println(var.getName()+ "="+var.getValue());
                    ret.add(var.getValue().toString());
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }


        return ret;
    }




}
