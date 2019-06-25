package rs.ftn.ingzanja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.ftn.ingzanja.model.Terapija;
import rs.ftn.ingzanja.repository.TerapijaRepository;

import java.util.List;

@Service
public class TerapijaServiceImpl implements  TerapijaService{

    @Autowired
    TerapijaRepository terapijaRepository;

    @Override
    public List<Terapija> findAll() {
        return this.terapijaRepository.findAll();
    }
}
