package rs.ftn.ingzanja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.ftn.ingzanja.model.Simptom;
import rs.ftn.ingzanja.repository.SymptomsRepository;

import java.util.List;

@Service
public class SimptomServiceImpl implements  SimtpomService{

    @Autowired
    SymptomsRepository repository;

    @Override
    public List<Simptom> findAll() {
        return repository.findAll();
    }
}
