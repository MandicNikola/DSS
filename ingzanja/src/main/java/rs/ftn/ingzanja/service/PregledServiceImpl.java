package rs.ftn.ingzanja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.ftn.ingzanja.model.Pacient;
import rs.ftn.ingzanja.model.Pregled;
import rs.ftn.ingzanja.repository.PacientRepository;
import rs.ftn.ingzanja.repository.PregledRepository;

@Service
public class PregledServiceImpl implements PregledService {

    @Autowired
    PregledRepository repository;

    @Autowired
    PacientRepository pacientRepo;

    @Override
    public void savePregledOnly(Pregled p) {

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
