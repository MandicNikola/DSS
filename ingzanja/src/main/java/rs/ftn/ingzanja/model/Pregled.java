package rs.ftn.ingzanja.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Pregled {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="terapija")
    private String terapija;

    @Column(name="dijagnoza")
    private String dijagnoza;

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

    public Pregled() { super(); }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pregled c = (Pregled) o;
        if(c.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), c.getId());
    }



}
