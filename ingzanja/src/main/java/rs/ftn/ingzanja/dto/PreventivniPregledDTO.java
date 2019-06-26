package rs.ftn.ingzanja.dto;

import rs.ftn.ingzanja.model.PreventivniPregled;

public class PreventivniPregledDTO {

    private Long id;

    private String dijagnostika;

    private Long pacientId;

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
}
