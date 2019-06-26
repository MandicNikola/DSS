package rs.ftn.ingzanja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.ftn.ingzanja.model.Dijagnostika;
import rs.ftn.ingzanja.repository.DijagnostikaRepository;

import java.util.List;

@Service
public class DijagnostikaServiceImpl implements DijagnostikaService {

    @Autowired
    DijagnostikaRepository dijagnostikaRepository;

    @Override
    public List<Dijagnostika> findAll() {
        return dijagnostikaRepository.findAll();
    }

    @Override
    public List<Dijagnostika> findByNaziv(String naziv) {
        return dijagnostikaRepository.findByNaziv(naziv);
    }
}
