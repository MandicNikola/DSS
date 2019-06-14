package rs.ftn.ingzanja.service;

import org.springframework.stereotype.Service;
import rs.ftn.ingzanja.model.Simptom;

import java.util.List;

@Service
public interface SimtpomService {

    List<Simptom> findAll();

}
