package rs.ftn.ingzanja.controller;

import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.ftn.ingzanja.dto.BolestDTO;
import rs.ftn.ingzanja.dto.PregledDTO;
import rs.ftn.ingzanja.model.*;
import rs.ftn.ingzanja.service.PregledServiceImpl;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "api/pregled")
public class PregledController {

    @Autowired
    PregledServiceImpl service;

    /**
     * Api za novi pregled prvi put
     * @param id - path variable param of pacient
     * @return id of pregled
     */
    @RequestMapping(
            value = "/new/{id}",
            method = RequestMethod.POST
    )
    public ResponseEntity<Long> noviPregled(@PathVariable("id") Long id)
    {

        Pregled pregled = new Pregled();
        Long retVal = service.savePregled(pregled, id);
        if(retVal == null)
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    /**
     *
     * @param id - identifier from pregled to save
     * @return -1-fail to save
     *         id -success saved
     */
    @RequestMapping(
            value = "/save/{id}",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Long> savePregled(@PathVariable("id") Long id, @RequestBody PregledDTO body)
    {
        Pregled p = service.findPregledById(id);
        if(p == null)
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        p.setDijagnoza(body.getDijagnoza());
        p.setTerapija(body.getTerapija());
        service.savePregledOnly(p,body);

        return new ResponseEntity<>(id, HttpStatus.OK);
    }

    /**
     * Metoda za dijagnozu potencijalnih bolesti, pomocu prologa
     * @param id - pregleda za koji se vrsi dijagnoza
     * @return retVal - ArrayList-a potencijalnih bolesti
     */
    @RequestMapping(
            value = "diagnoseProlog/{id}",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<ArrayList<String>> diagnoseProlog(@PathVariable("id") Long id)
    {
        Pregled p = service.findPregledById(id);
        if(p == null)
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        Pacient pacient = p.getPacient();

        //PAZITI NA ENUME
        Race rasa = pacient.getRasa();
        Pol pol = pacient.getPol();
        int godiste = pacient.getGodiste();
        ArrayList<String> simptomi = new ArrayList<>();
        for(Simptom s : p.getSimptoms())
        {
            simptomi.add(s.getNaziv());
        }
        //pripremljeni simptomi i sve

        ArrayList<String> retLista = new ArrayList<>();
        //PROLOG LOGIKA DA SE IMPLEMENTIRA ZA DOBIJANJE POTENICIJALNE BOLESTI


        return new ResponseEntity<>(retLista, HttpStatus.OK);
    }


    /**
     * Metoda za dijagnozu potencijalnih terapija na osnovu bolesti, pomocu prologa
     * @param obj - param za koji se daju moguce terapije
     * @return retList - ArrayList-a potencijalnih terapija
     */
    @RequestMapping(
            value = "/diagnoseTerapyProlog",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<ArrayList<String>> diagnoseTerapyProlog(@RequestBody BolestDTO obj)
    {
        String bolest = obj.getBolest();
        //prolog logika vracas mi string mogucih terapija
        ArrayList<String> retList = new ArrayList<>();


        return new ResponseEntity<ArrayList<String>>(retList, HttpStatus.OK);
    }

    /**
     * Metoda za vracanje liste lekova za neku bolest
     * @param obj - param za koji se daju moguce terapije
     * @return retList - ArrayList-a potencijalnih terapija
     */
    @RequestMapping(
            value = "/lek",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<ArrayList<String>> lekZaBolest(@RequestBody BolestDTO obj)
    {
        String bolest = obj.getBolest();
        //prolog logika vracas mi string mogucih lekova
        ArrayList<String> retList = new ArrayList<>();

        return new ResponseEntity<ArrayList<String>>(retList, HttpStatus.OK);
    }









}
