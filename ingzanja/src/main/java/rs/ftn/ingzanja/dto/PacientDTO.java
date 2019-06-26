package rs.ftn.ingzanja.dto;

import rs.ftn.ingzanja.model.Pacient;
import rs.ftn.ingzanja.model.Pol;
import rs.ftn.ingzanja.model.Race;

import java.util.List;

public class PacientDTO {

    private Long id;

    private String ime;

    private String prezime;

    private int godiste;

    private String JMBG;

    private Pol pol;

    private Race rasa;

    private String telefon;

    private String adresa;

    private List<String> porodicneBolesti;

    private List<String> istorijaBolesti;

    private boolean alkohol;

    private boolean pusac;

    private String debljina;

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


    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public List<String> getPorodicneBolesti() {
        return porodicneBolesti;
    }

    public void setPorodicneBolesti(List<String> porodicneBolesti) {
        this.porodicneBolesti = porodicneBolesti;
    }

    public List<String> getIstorijaBolesti() {
        return istorijaBolesti;
    }

    public void setIstorijaBolesti(List<String> istorijaBolesti) {
        this.istorijaBolesti = istorijaBolesti;
    }

    public boolean isAlkohol() {
        return alkohol;
    }

    public void setAlkohol(boolean alkohol) {
        this.alkohol = alkohol;
    }

    public boolean isPusac() {
        return pusac;
    }

    public void setPusac(boolean pusac) {
        this.pusac = pusac;
    }

    public String getDebljina() {
        return debljina;
    }

    public void setDebljina(String debljina) {
        this.debljina = debljina;
    }

    public Race getRasa() {
        return rasa;
    }

    public void setRasa(Race rasa) {
        this.rasa = rasa;
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
