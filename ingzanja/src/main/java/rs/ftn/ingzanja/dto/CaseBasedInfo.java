package rs.ftn.ingzanja.dto;

import java.util.List;
public class CaseBasedInfo {



    private Long idPregleda;
    private List<String> simptomi;

    public CaseBasedInfo() {}


    public Long getIdPregleda() {
        return idPregleda;
    }

    public void setIdPregleda(Long idPregleda) {
        this.idPregleda = idPregleda;
    }

    public List<String> getSimptomi() {
        return simptomi;
    }

    public void setSimptomi(List<String> simptomi) {
        this.simptomi = simptomi;
    }
}
