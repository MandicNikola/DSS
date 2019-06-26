package rs.ftn.ingzanja.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="terapija")
public class Terapija {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="naziv")
    private String naziv;

    @OneToMany(mappedBy = "terapija")
    @JsonIgnore
    private List<Pregled> pregledi = new ArrayList<>();

    public Terapija(){}

    public List<Pregled> getPregledi() {
        return pregledi;
    }

    public void setPregled(List<Pregled> pregledi) {
        this.pregledi = pregledi;
    }

    public Terapija(String naziv) {
        this.naziv = naziv;
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
