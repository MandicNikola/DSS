package rs.ftn.ingzanja.model;

import javax.persistence.*;

@Entity
@Table(name="bolest")
public class Bolest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="naziv")
    private String naziv;

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