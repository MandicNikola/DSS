package rs.ftn.ingzanja.dto;

import rs.ftn.ingzanja.model.Pacient;
import rs.ftn.ingzanja.model.Pol;
import rs.ftn.ingzanja.model.Race;

public class PacientDTO {

    private Long id;

    private String ime;

    private String prezime;

    private int godiste;

    private String JMBG;

    private Pol pol;

    public PacientDTO(){
        super();
    }

    public PacientDTO(String ime , String prezime, Long id, int godiste, String JMBG, Pol pol)
    {
        super();
        this.godiste = godiste;
        this.ime = ime;
        this.prezime = prezime;
        this.id = id;
        this.JMBG = JMBG;
        this.pol = pol;
    }



    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodiste() {
        return godiste;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }

    public String getJMBG() {
        return JMBG;
    }

    public void setJMBG(String JMBG) {
        this.JMBG = JMBG;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Pol getPol() {
        return pol;
    }

    public void setPol(Pol pol) {
        this.pol = pol;
    }
}
