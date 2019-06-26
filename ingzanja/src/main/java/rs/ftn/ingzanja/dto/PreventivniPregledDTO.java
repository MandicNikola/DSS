package rs.ftn.ingzanja.dto;

import rs.ftn.ingzanja.model.PreventivniPregled;

import java.util.ArrayList;
import java.util.List;

public class PreventivniPregledDTO {

    private Long id;

    private String dijagnostika;

    private Long pacientId;

    private List<String> mogucaDijagnostika = new ArrayList<>();

    public PreventivniPregledDTO(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDijagnostika() {
        return dijagnostika;
    }

    public void setDijagnostika(String dijagnostika) {
        this.dijagnostika = dijagnostika;
    }

    public Long getPacientId() {
        return pacientId;
    }

    public void setPacientId(Long pacientId) {
        this.pacientId = pacientId;
    }


    public List<String> getMogucaDijagnostika() {
        return mogucaDijagnostika;
    }

    public void setMogucaDijagnostika(List<String> mogucaDijagnostika) {
        this.mogucaDijagnostika = mogucaDijagnostika;
    }
}
