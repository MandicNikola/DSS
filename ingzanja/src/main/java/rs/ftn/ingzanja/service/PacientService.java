package rs.ftn.ingzanja.service;

import org.springframework.stereotype.Service;
import rs.ftn.ingzanja.model.Pacient;

import java.util.List;

@Service
public interface PacientService {

    void savePacient(Pacient pacient);
    Pacient findPacientById(Long id);
    List<Pacient> findAllPacients();

}
