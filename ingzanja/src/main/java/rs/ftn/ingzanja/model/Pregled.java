package rs.ftn.ingzanja.model;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="pregled")
public class Pregled {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Dijagnostika dijagnostika;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Bolest dijagnoza;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Terapija terapija;

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

//    @Column(name="isComplet",columnDefinition = "boolean default false")
//    private boolean isComplet;


    public Pregled() { super(); }

//    public boolean isComplet() {
//        return isComplet;
//    }
//
//    public void setComplet(boolean complet) {
//        isComplet = complet;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Dijagnostika getDijagnostika() {
        return dijagnostika;
    }

    public void setDijagnostika(Dijagnostika dijagnostika) {
        this.dijagnostika = dijagnostika;
    }

    public Bolest getDijagnoza() {
        return dijagnoza;
    }

    public void setDijagnoza(Bolest dijagnoza) {
        this.dijagnoza = dijagnoza;
    }

    public Terapija getTerapija() {
        return terapija;
    }

    @JsonIgnore
    public void setTerapija(Terapija terapija) {
        this.terapija = terapija;
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
