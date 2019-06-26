package rs.ftn.ingzanja.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
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
    @JsonIgnore
    private List<PreventivniPregled> preventivniPregledi;

    @OneToOne(mappedBy = "dijagnostika")
    @JsonIgnore
    private Pregled pregled;


    public Pregled getPregled() {
        return pregled;
    }

    public void setPregled(Pregled pregled) {
        this.pregled = pregled;
    }

    public List<PreventivniPregled> getPreventivniPregledi() {
        return preventivniPregledi;
    }

    public Dijagnostika(){

    }

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
