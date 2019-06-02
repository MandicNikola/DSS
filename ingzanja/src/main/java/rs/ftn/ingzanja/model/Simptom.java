package rs.ftn.ingzanja.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Simptom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="naziv")
    private String naziv;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Simptom() { super(); }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Simptom c = (Simptom) o;
        if(c.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), c.getId());
    }



}
