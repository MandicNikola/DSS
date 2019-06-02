package rs.ftn.ingzanja.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Pacient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="ime", nullable = false)
    private String ime;

    @Column(name="prezime", nullable = false)
    private String prezime;

    @Column(name="godiste", nullable = false)
    private int godiste;

    @Column(name = "JMBG", nullable = false)
    private String JMBG;


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

    public Pacient() { super();  }

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
