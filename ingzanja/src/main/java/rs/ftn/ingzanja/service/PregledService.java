package rs.ftn.ingzanja.service;

import org.springframework.stereotype.Service;
import rs.ftn.ingzanja.dto.PregledDTO;
import rs.ftn.ingzanja.model.Pregled;

@Service
public interface PregledService {

    void savePregledOnly(Pregled p, PregledDTO body);
    Long savePregled(Pregled p, Long id);
    Pregled findPregledById(Long id);

}
