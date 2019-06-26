package rs.ftn.ingzanja.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="bolest")
public class Bolest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="naziv")
    private String naziv;

    @ManyToMany(mappedBy = "porodicneBolesti")
    @JsonIgnore
    List<Pacient> porodicneBolestiPacient;

    @ManyToMany(mappedBy = "istorijaBolesti")
    @JsonIgnore
    List<Pacient> istorijaBolestiPacient;

    @OneToOne(mappedBy = "dijagnoza")
    @JsonIgnore
    private Pregled pregled;

    public Bolest(){

    }

    public Pregled getPregled() {
        return pregled;
    }

    public void setPregled(Pregled pregled) {
        this.pregled = pregled;
    }

    public List<Pacient> getPorodicneBolestiPacient() {
        return porodicneBolestiPacient;
    }

    public void setPorodicneBolestiPacient(List<Pacient> porodicneBolestiPacient) {
        this.porodicneBolestiPacient = porodicneBolestiPacient;
    }

    public List<Pacient> getIstorijaBolestiPacient() {
        return istorijaBolestiPacient;
    }

    public void setIstorijaBolestiPacient(List<Pacient> istorijaBolestiPacient) {
        this.istorijaBolestiPacient = istorijaBolestiPacient;
    }

    public Bolest(String naziv) {
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
