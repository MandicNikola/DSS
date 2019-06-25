package rs.ftn.ingzanja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.ftn.ingzanja.model.Bolest;
import rs.ftn.ingzanja.repository.BolestRepository;

import java.util.List;

@Service
public class BolestServiceImpl implements BolestService {

    @Autowired
    BolestRepository bolestRepository;

    @Override
    public List<Bolest> findAll() {
        return this.bolestRepository.findAll();
    }
}
