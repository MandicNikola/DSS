package rs.ftn.ingzanja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import rs.ftn.ingzanja.model.Pol;
import rs.ftn.ingzanja.repository.PacientRepository;
import rs.ftn.ingzanja.repository.PregledRepository;
import rs.ftn.ingzanja.repository.SymptomsRepository;
import rs.ftn.ingzanja.service.CaseBasedService;
import rs.ftn.ingzanja.model.CBRModel;
import rs.ftn.ingzanja.dto.CBRDTO;
import rs.ftn.ingzanja.model.Pacient;
import rs.ftn.ingzanja.model.Pregled;
import rs.ftn.ingzanja.dto.CaseBasedInfo;

@RestController
@RequestMapping(value="api/caseBased")
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


        Pregled pregled = pregledRepository.findById(cb.getiDPregleda()).get();
        CBRModel cbr = new CBRModel();


        int godine = pregled.getPacient().getGodiste();
        Pol pol = pregled.getPacient().getPol();

        //Pacient p = pacientRepository.findById(id).get();

        cbr.setGodine(godine);
        cbr.setPol(pol);

        return caseBasedService.getMatches(cbr);




    }











}
