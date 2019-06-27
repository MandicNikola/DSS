package rs.ftn.ingzanja.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="dijagnostika")
public class Dijagnostika {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="naziv")
    private String naziv;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "dijagnostika")

    private List<PreventivniPregled> preventivniPregledi;

    @OneToMany(mappedBy = "dijagnostika")

    private List<Pregled> pregledi = new ArrayList<>();



    public List<Pregled> getPregledi() {
        return pregledi;
    }

    @JsonIgnore
    public void setPregledi(List<Pregled> pregledi) {
        this.pregledi = pregledi;
    }

    public List<PreventivniPregled> getPreventivniPregledi() {
        return preventivniPregledi;
    }

    public Dijagnostika(){

    }
    @JsonIgnore
    public void setPreventivniPregledi(List<PreventivniPregled> preventivniPregledi) {
        this.preventivniPregledi = preventivniPregledi;
    }

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
}
