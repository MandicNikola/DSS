package rs.ftn.ingzanja.model;

import org.codehaus.jackson.annotate.JsonIgnore;

import rs.ftn.ingzanja.dto.PacientDTO;

import javax.persistence.*;
import java.util.*;

@Entity
public class Pacient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="ime", nullable = false)
    private String ime;

    @Column(name="prezime", nullable = false)
    private String prezime;

    @Column(name="godiste", nullable = false)
    private int godiste;

    @Column(name = "JMBG")
    private String JMBG;

    @Enumerated(EnumType.STRING)
    @Column(name="rasa")
    private Race rasa;

    @Enumerated(EnumType.STRING)
    @Column(name="pol")
    private Pol pol;

    @Column(name="telefon")
    private String telefon;

    @Column(name="adresa")
    private String adresa;

    @Column(name="alkohol")
    private boolean alkohol;

    @Column(name="pusac")
    private boolean pusac;

    @Column(name="debljina")
    private String debljina;

    @ManyToMany
    @JoinTable(
            name = "porodicneBolesti",
            joinColumns = @JoinColumn(name = "id_pacijent"),
            inverseJoinColumns = @JoinColumn(name = "id_bolest"))
    private List<Bolest> porodicneBolesti = new ArrayList<>();


    @ManyToMany
    @JoinTable(
            name = "istorijaBolesti",
            joinColumns = @JoinColumn(name = "id_pacijent"),
            inverseJoinColumns = @JoinColumn(name = "id_bolest"))
    private List<Bolest> istorijaBolesti = new ArrayList<>();


    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "pacient"
    )
    private Set<Pregled> pregledi = new HashSet<>();


    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "pacientPP"
    )
    @JsonIgnore
    private List<PreventivniPregled> preventivniPregledi=new ArrayList<>();


    public List<PreventivniPregled> getPreventivniPregledi() {
        return preventivniPregledi;
    }

    public void setPreventivniPregledi(List<PreventivniPregled> preventivniPregledi) {
        this.preventivniPregledi = preventivniPregledi;
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

    public List<Bolest> getPorodicneBolesti() {
        return porodicneBolesti;
    }

    public void setPorodicneBolesti(List<Bolest> porodicneBolesti) {
        this.porodicneBolesti = porodicneBolesti;
    }

    public List<Bolest> getIstorijaBolesti() {
        return istorijaBolesti;
    }

    public void setIstorijaBolesti(List<Bolest> istorijaBolesti) {
        this.istorijaBolesti = istorijaBolesti;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
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

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Set<Pregled> getPregledi() {
        return pregledi;
    }

    public void setPregledi(Set<Pregled> pregledi) {
        this.pregledi = pregledi;
    }

    public Race getRasa() {
        return rasa;
    }

    public void setRasa(Race rasa) {
        this.rasa = rasa;
    }

    public Pol getPol() {
        return pol;
    }

    public void setPol(Pol pol) {
        this.pol = pol;
    }

    public Pacient() { super();  }

    public Pacient(PacientDTO pacient)
    {
        super();
        this.godiste = pacient.getGodiste();
        this.ime = pacient.getIme();
        this.JMBG = pacient.getJMBG();
        this.prezime = pacient.getPrezime();
        this.telefon=pacient.getTelefon();
        this.adresa=pacient.getAdresa();
        this.debljina=pacient.getDebljina();
        this.alkohol=pacient.isAlkohol();
        this.pusac=pacient.isPusac();
        this.pol=pacient.getPol();
        this.rasa=pacient.getRasa();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pacient c = (Pacient) o;
        if(c.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, c.id);
    }



}
