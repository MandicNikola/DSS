package rs.ftn.ingzanja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.ftn.ingzanja.model.Bolest;
import rs.ftn.ingzanja.model.Simptom;
import rs.ftn.ingzanja.model.Terapija;
import rs.ftn.ingzanja.service.BolestService;
import rs.ftn.ingzanja.service.SimptomServiceImpl;
import rs.ftn.ingzanja.service.SimtpomService;
import rs.ftn.ingzanja.service.TerapijaService;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Controller for getting simptoms
 */
@RestController
@RequestMapping(value = "api/simptoms")
@CrossOrigin(origins = "http://localhost:4200")
public class SimptomsContoller {

    @Autowired
    SimptomServiceImpl service;

    @Autowired
    BolestService bolestService;

    @Autowired
    TerapijaService terapijaService;

    @RequestMapping(value ="/all",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET
    )
    public ResponseEntity<ArrayList<String>> allSimptoms()
    {
        List<Simptom> simptoms = service.findAll();
        ArrayList<String> retSimptoms = new ArrayList<>();
        for(Simptom simptom : simptoms)
        {
            retSimptoms.add(simptom.getNaziv());
        }

        return new ResponseEntity<>(retSimptoms, HttpStatus.OK);
    }

    @GetMapping(value="/bolesti",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<?> allDiseases(){
        List<Bolest> ret=this.bolestService.findAll();
        return new ResponseEntity<>(ret, HttpStatus.OK);
    }

    @GetMapping(value="/terapije",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<?> allTerapije(){
        List<Terapija> ret=this.terapijaService.findAll();
        return new ResponseEntity<>(ret, HttpStatus.OK);
    }


}
