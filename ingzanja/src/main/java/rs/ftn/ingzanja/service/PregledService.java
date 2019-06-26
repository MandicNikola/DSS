package rs.ftn.ingzanja.service;

import org.springframework.stereotype.Service;
import rs.ftn.ingzanja.dto.PregledDTO;
import rs.ftn.ingzanja.model.Pacient;
import rs.ftn.ingzanja.model.Pregled;

import java.util.List;

@Service
public interface PregledService {

    void savePregledOnly(Pregled p, PregledDTO body);
    Long savePregled(Pregled p, Long id);
    Pregled findPregledById(Long id);
    void saveSimptoms(List<String> simptoms,Pregled pregled);

}
