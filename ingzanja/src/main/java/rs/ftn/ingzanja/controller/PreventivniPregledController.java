package rs.ftn.ingzanja.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import rs.ftn.ingzanja.dto.PreventivniPregledDTO;
import rs.ftn.ingzanja.model.*;
import rs.ftn.ingzanja.service.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "api/preventivni")
@CrossOrigin(origins = "http://localhost:4200")
public class PreventivniPregledController {

    @Autowired
    PregledServiceImpl service;

    @Autowired
    PreventivniPregledServiceImpl preventivniPregledService;

    @Autowired
    DijagnostikaServiceImpl dijagnostikaService;

    @Autowired
    PacientService pacientService;

    /**
     * Api za novi preventivni pregled ako vec ne postoji
     * @param id - path variable param of pacient
     * @return id of pregled
     */
    @RequestMapping(
            value = "/new/{id}",
            method = RequestMethod.POST
    )
    public ResponseEntity<Long> noviPreventivniPregled(@PathVariable("id") Long id)
    {

        PreventivniPregled ppregled=new PreventivniPregled();
        Long retVal = preventivniPregledService.savePreventivniPregled(ppregled,id);
        if(retVal == null)
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>(retVal, HttpStatus.OK);
    }

    @RequestMapping(
            value = "/getAll/{id}",
            method = RequestMethod.GET
    )
    public ResponseEntity<?> getAll(@PathVariable("id") Long id)
    {
        Pacient pacient=pacientService.findPacientById(id);
        if(pacient == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        List<PreventivniPregled> preventivniPregledi=pacient.getPreventivniPregledi();
        List<PreventivniPregledDTO> preventivniPregledDTOS=new ArrayList<>();

        for(PreventivniPregled preventivniPregled:preventivniPregledi){
            PreventivniPregledDTO preventivniPregledDTO=new PreventivniPregledDTO();
            if(preventivniPregled.getDijagnostika() ==null){
                preventivniPregledDTO.setDijagnostika("");
            }else{
                preventivniPregledDTO.setDijagnostika(preventivniPregled.getDijagnostika().getNaziv());
            }
            preventivniPregledDTOS.add(preventivniPregledDTO);
        }

        return new ResponseEntity<>(preventivniPregledDTOS,HttpStatus.OK);
    }


    /**
     * Metoda prima id korisnika
     * Vraca niz[string] najpodobnijih dijagnostika za preventivni pregled
     *
     */
    @RequestMapping(value = "/prevdiagnostic/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<?> getPreventivneDijagnostike(@PathVariable("id") Long id){

            PreventivniPregled pp=preventivniPregledService.findPreventivniPregledById(id);
            if(pp==null){
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            List<String> ret=preventivniPregledService.prevDiagnostics(pp);

            return new ResponseEntity<>(ret, HttpStatus.OK);

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
    public ResponseEntity<Long> savepreventivniPregled(@PathVariable("id") Long id, @RequestBody PreventivniPregledDTO body)
    {
        PreventivniPregled pp=preventivniPregledService.findPreventivniPregledById(id);
        if(pp == null)
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        Dijagnostika d=dijagnostikaService.findByNaziv(body.getDijagnostika()).get(0);

        pp.setDijagnostika(d);
        id=preventivniPregledService.saveOnePP(pp,id);

        return new ResponseEntity<>(id, HttpStatus.OK);
    }

}
