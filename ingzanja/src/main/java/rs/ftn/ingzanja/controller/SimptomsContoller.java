package rs.ftn.ingzanja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import rs.ftn.ingzanja.model.Simptom;
import rs.ftn.ingzanja.service.SimptomServiceImpl;
import rs.ftn.ingzanja.service.SimtpomService;

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

    @RequestMapping(value ="all",
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


}
