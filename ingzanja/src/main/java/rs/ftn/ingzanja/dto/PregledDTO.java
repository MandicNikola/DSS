package rs.ftn.ingzanja.dto;

import rs.ftn.ingzanja.model.Pregled;

import java.util.ArrayList;

public class PregledDTO {

    private Long id;

    private String terapija;

    private String dijagnoza;

    private ArrayList<Long> simptoms;

    private Long pacientId;

    public PregledDTO(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTerapija() {
        return terapija;
    }

    public void setTerapija(String terapija) {
        this.terapija = terapija;
    }

    public String getDijagnoza() {
        return dijagnoza;
    }

    public void setDijagnoza(String dijagnoza) {
        this.dijagnoza = dijagnoza;
    }

    public ArrayList<Long> getSimptoms() {
        return simptoms;
    }

    public void setSimptoms(ArrayList<Long> simptoms) {
        this.simptoms = simptoms;
    }

    public Long getPacientId() {
        return pacientId;
    }

    public void setPacientId(Long pacientId) {
        this.pacientId = pacientId;
    }
}
