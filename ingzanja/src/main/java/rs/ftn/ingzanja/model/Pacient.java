package rs.ftn.ingzanja.model;

import org.codehaus.jackson.annotate.JsonIgnore;
import rs.ftn.ingzanja.dto.PacientDTO;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

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

    @Column(name = "JMBG", nullable = false)
    private String JMBG;

    @Enumerated(EnumType.STRING)
    @Column(name="rasa")
    private Race rasa;

    @Enumerated(EnumType.STRING)
    @Column(name="pol")
    private Pol pol;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "pacient"
    )
    private Set<Pregled> pregledi = new HashSet<>();


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
