package rs.ftn.ingzanja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.ftn.ingzanja.dto.PregledDTO;
import rs.ftn.ingzanja.model.Pacient;
import rs.ftn.ingzanja.model.Pregled;
import rs.ftn.ingzanja.service.PregledServiceImpl;

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
        //zavrsiti ubacivanje simptoma koje mi je potrebno
        //i ubaciti rasu koja mi treba

        return new ResponseEntity<>(id, HttpStatus.OK);
    }



}
