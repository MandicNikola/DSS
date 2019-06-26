package rs.ftn.ingzanja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.ftn.ingzanja.dto.PacientDTO;
import rs.ftn.ingzanja.dto.PregledDTO;
import rs.ftn.ingzanja.model.Bolest;
import rs.ftn.ingzanja.model.Pacient;
import rs.ftn.ingzanja.model.Pregled;
import rs.ftn.ingzanja.service.BolestService;
import rs.ftn.ingzanja.service.PacientService;
import rs.ftn.ingzanja.service.PacientServiceImpl;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "api/pacients")
@CrossOrigin(origins = "http://localhost:4200")
public class PacientContoller {

    @Autowired
    PacientServiceImpl service;

    @Autowired
    BolestService bolestService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public List<String> test() {
        ArrayList<String> retList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            retList.add("list " + i);
        }
        return retList;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<PacientDTO>> getAllPacients() {
        ArrayList<PacientDTO> retList = new ArrayList<>();
        List<Pacient> list = service.findAllPacients();
        for(Pacient pacient: list)
        {
            retList.add(new PacientDTO(pacient.getIme(),pacient.getPrezime(), pacient.getId(), pacient.getGodiste(), pacient.getJMBG(), pacient.getPol()));
        }

        return new ResponseEntity<>(retList, HttpStatus.OK);

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
        List<Bolest> ib=new ArrayList<>();
        List<Bolest> pb=new ArrayList<>();

        for(String s:dto.getIstorijaBolesti()){
            Bolest b=bolestService.findByNaziv(s).get(0);
            ib.add(b);
        }

        for(String s:dto.getPorodicneBolesti()){
            Bolest b=bolestService.findByNaziv(s).get(0);
            pb.add(b);
        }
        p.setPorodicneBolesti(pb);
        p.setIstorijaBolesti(ib);

        service.savePacient(p);
        return p;
    }

    @RequestMapping(value = "/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<PacientDTO> getPacijent(@PathVariable("id") Long id){
        Pacient p=service.findPacientById(id);

        PacientDTO pacientDTO = new PacientDTO();

        if(p != null){
            pacientDTO.setIme(p.getIme());
            pacientDTO.setPol(p.getPol());
            pacientDTO.setAdresa(p.getAdresa());
            pacientDTO.setJMBG(p.getJMBG());
            pacientDTO.setPrezime(p.getPrezime());
            pacientDTO.setId(p.getId());
            pacientDTO.setGodiste(p.getGodiste());
            List<String> istorijaBolesti = new ArrayList<>();
            for(Bolest bolest : p.getIstorijaBolesti())
            {
                istorijaBolesti.add(bolest.getNaziv());
            }
            pacientDTO.setIstorijaBolesti(istorijaBolesti);

            List<String> istorijaBolestiPorodica = new ArrayList<>();
            for(Bolest bolest : p.getPorodicneBolesti())
            {
                istorijaBolestiPorodica.add(bolest.getNaziv());
            }
            pacientDTO.setPorodicneBolesti(istorijaBolestiPorodica);

            return new ResponseEntity<PacientDTO>(pacientDTO,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @RequestMapping(value = "/pregledi/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<ArrayList<PregledDTO>> pregledi(@PathVariable("id") Long id)
    {
            ArrayList<PregledDTO> retLista = new ArrayList<>();
            Pacient p = service.findPacientById(id);
            if(p == null)
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

            for(Pregled pregled : p.getPregledi()){
                PregledDTO dto = new PregledDTO();
                Long idPregleda = pregled.getId();
                String terapija = pregled.getTerapija().getNaziv();
                String dijagnoza = pregled.getDijagnoza().getNaziv();
               // String lek = pregled.getLek();
                if(terapija == null)
                    dto.setTerapija("");
                else
                    dto.setTerapija(terapija);
                if(dijagnoza == null)
                    dto.setDijagnoza("");
                else
                    dto.setDijagnoza(dijagnoza);
               // if(lek == null)
                 //   dto.setLek("");
             //   else
              //      dto.setLek(lek);

                dto.setId(idPregleda);
                dto.setPacientId(id);
                retLista.add(dto);
            }

            return new ResponseEntity<>(retLista,HttpStatus.OK);
    }




}
