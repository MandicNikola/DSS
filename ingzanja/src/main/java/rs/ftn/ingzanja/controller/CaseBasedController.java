package rs.ftn.ingzanja.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import rs.ftn.ingzanja.model.*;
import rs.ftn.ingzanja.repository.PacientRepository;
import rs.ftn.ingzanja.repository.PregledRepository;
import rs.ftn.ingzanja.repository.SymptomsRepository;
import rs.ftn.ingzanja.service.CaseBasedService;
import rs.ftn.ingzanja.dto.CBRDTO;
import rs.ftn.ingzanja.dto.CaseBasedInfo;

@RestController
@RequestMapping(value="api/caseBased")
@CrossOrigin(origins = "http://localhost:4200")
public class CaseBasedController {


    @Autowired
    private PacientRepository pacientRepository;

    @Autowired
    private PregledRepository pregledRepository;

    @Autowired
    private SymptomsRepository symptomsRepository;

    @Autowired
    private CaseBasedService caseBasedService ;


    @RequestMapping(value = "/case", method = RequestMethod.POST)
    public List<CBRDTO> getNajboljiSlucaj( @RequestBody CaseBasedInfo cb){


        Pregled pregled = pregledRepository.findById(cb.getIdPregleda()).get();

        int godine = pregled.getPacient().getGodiste();
        String pol = pregled.getPacient().getPol().toString();

        //Pacient p = pacientRepository.findById(id).get();

        List<CBRDTO> cbrdtoList = new ArrayList<>();

        for(String simptom : cb.getSimptomi())
        {
            CBRModel cbr = new CBRModel();
            cbr.setGodine(godine);
            cbr.setPol(pol);
            cbr.setSimptom(simptom);
            List<CBRDTO> list = caseBasedService.getMatches(cbr);
            cbrdtoList.addAll(list);
        }

        HashMap<Long,Pregled> pregledHashMap = new HashMap<>();
        for(CBRDTO cbrdto: cbrdtoList)
        {
            if(pregledHashMap.get(cbrdto.getId()) == null)
            {
                Pregled p = pregledRepository.findOneById(cbrdto.getId());
                pregledHashMap.put(p.getId(),p);
            }
        }

        List<CBRDTO> retDto = new ArrayList<>();

        for(Pregled p : pregledHashMap.values())
        {
            if(check(p,cb.getSimptomi()))
            {
                CBRDTO dto = new CBRDTO();
                dto.setDijagnostika(p.getDijagnostika().getNaziv());
                dto.setTerapija(p.getTerapija().getNaziv());
                dto.setDijagnoza(p.getDijagnoza().getNaziv());
                retDto.add(dto);
            }
        }

        return retDto;
    }

    //method for checking if cases are ok for pregled
    public boolean check(Pregled p, List<String> list) {

        int pregledSimptomLength = p.getSimptoms().size();
        int simptomLength = list.size();

        if(pregledSimptomLength != simptomLength)
            return false;

        boolean isOk = false;
        for(Simptom s : p.getSimptoms())
        {
            isOk = false;
            for(String simptom : list)
            {
                if(simptom.equals(s.getNaziv())) {
                    isOk = true;
                    break;
                }
            }
            if(!isOk)
                break;
        }

        return isOk;
    }



}
