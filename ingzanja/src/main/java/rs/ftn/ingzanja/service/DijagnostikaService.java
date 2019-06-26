package rs.ftn.ingzanja.service;

import rs.ftn.ingzanja.model.Dijagnostika;

import java.util.List;

public interface DijagnostikaService {
    List<Dijagnostika> findAll();

    List<Dijagnostika> findByNaziv(String naziv);
}
