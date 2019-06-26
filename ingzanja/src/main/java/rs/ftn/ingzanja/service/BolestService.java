package rs.ftn.ingzanja.service;

import rs.ftn.ingzanja.model.Bolest;

import java.util.List;

public interface BolestService {

    List<Bolest> findAll();
    List<Bolest> findByNaziv(String naziv);
}
