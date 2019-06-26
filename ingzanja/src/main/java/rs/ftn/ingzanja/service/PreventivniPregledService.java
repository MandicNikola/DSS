package rs.ftn.ingzanja.service;


import rs.ftn.ingzanja.model.PreventivniPregled;

import java.util.List;

public interface PreventivniPregledService {

    //void savePregledOnly(PreventivniPregled pp, Pre body);
    Long savePreventivniPregled(PreventivniPregled pp, Long id);
    PreventivniPregled findPreventivniPregledById(Long id);
    List<PreventivniPregled> findAll();
    List<String> prevDiagnostics(PreventivniPregled pp);
    Long saveOnePP(PreventivniPregled pp, Long id);
}
