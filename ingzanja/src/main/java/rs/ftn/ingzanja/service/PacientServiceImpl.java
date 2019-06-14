package rs.ftn.ingzanja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.ftn.ingzanja.model.Pacient;
import rs.ftn.ingzanja.repository.PacientRepository;

import java.util.List;

@Service
public class PacientServiceImpl implements PacientService{

    @Autowired
    private PacientRepository repository;


    @Override
    public void savePacient(Pacient pacient) {
        repository.save(pacient);
    }

    @Override
    public Pacient findPacientById(Long id) {
        return repository.findOneById(id);
    }

    @Override
    public List<Pacient> findAllPacients() {
        return repository.findAll();
    }

}
