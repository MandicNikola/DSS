package rs.ftn.ingzanja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.ftn.ingzanja.dto.PacientDTO;
import rs.ftn.ingzanja.model.Pacient;
import rs.ftn.ingzanja.model.Pregled;
import rs.ftn.ingzanja.service.PacientService;
import rs.ftn.ingzanja.service.PacientServiceImpl;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "api/pacients")
public class PacientContoller {

    @Autowired
    PacientServiceImpl service;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public List<String> test() {
        ArrayList<String> retList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            retList.add("list " + i);
        }
        return retList;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Pacient> getAllPacients() {
        return service.findAllPacients();
    }

    @RequestMapping(value = "/add",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public @ResponseBody
    Pacient addPacient(@RequestBody PacientDTO dto)
    {
        Pacient p = new Pacient(dto);
        service.savePacient(p);
        return p;
    }



}
