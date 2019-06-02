package rs.ftn.ingzanja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.ftn.ingzanja.dto.PregledDTO;
import rs.ftn.ingzanja.model.Pacient;
import rs.ftn.ingzanja.model.Pregled;
import rs.ftn.ingzanja.model.Simptom;
import rs.ftn.ingzanja.repository.PacientRepository;
import rs.ftn.ingzanja.repository.PregledRepository;
import rs.ftn.ingzanja.repository.SymptomsRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PregledServiceImpl implements PregledService {

    @Autowired
    PregledRepository repository;

    @Autowired
    PacientRepository pacientRepo;

    @Autowired
    SymptomsRepository symptomRepo;

    @Override
    public void savePregledOnly(Pregled p, PregledDTO body) {

        Set<Simptom> simptoms = new HashSet<>();
        for(String s : body.getSimptoms())
        {
            Simptom simptom = symptomRepo.findOneByNaziv(s);
            if(simptom != null)
                simptoms.add(simptom);
        }
        p.setSimptoms(simptoms);
        repository.save(p);

    }

    @Override
    public Long savePregled(Pregled p, Long id) {
        Pacient pacijent = pacientRepo.findOneById(id);
        if(p == null)
            return null;

        p.setPacient(pacijent);
        Pregled saved = repository.save(p);
        return saved.getId();
    }

    @Override
    public Pregled findPregledById(Long id) {
        return repository.findOneById(id);
    }
}
