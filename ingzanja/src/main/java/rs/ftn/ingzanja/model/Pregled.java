package rs.ftn.ingzanja.model;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Pregled {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="terapija")
    private String terapija;

    @Column(name="dijagnoza")
    private String dijagnoza;

    @Column(name="lek")
    private String lek;

    @ManyToMany
    @JoinTable(
            name="pregled_simptomi",
            joinColumns = @JoinColumn(name="pregled_id"),
            inverseJoinColumns = @JoinColumn(name = "simptom_id")
    )
    private
    Set<Simptom> simptoms = new HashSet<>();

    @ManyToOne(fetch = FetchType.EAGER)
    private Pacient pacient;


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

    public Set<Simptom> getSimptoms() {
        return simptoms;
    }

    public void setSimptoms(Set<Simptom> simptoms) {
        this.simptoms = simptoms;
    }

    public Pacient getPacient() {
        return pacient;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    public String getLek() {
        return lek;
    }

    public void setLek(String lek) {
        this.lek = lek;
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
