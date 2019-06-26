package rs.ftn.ingzanja.model;

import javax.persistence.*;
import java.lang.annotation.Repeatable;


@Entity
@Table(name="preventivni_pregled")
public class PreventivniPregled {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private Pacient pacientPP;

    @ManyToOne(fetch=FetchType.EAGER)
    private Dijagnostika dijagnostika;


    public PreventivniPregled(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pacient getPacientPP() {
        return pacientPP;
    }

    public void setPacientPP(Pacient pacientPP) {
        this.pacientPP = pacientPP;
    }

    public Dijagnostika getDijagnostika() {
        return dijagnostika;
    }

    public void setDijagnostika(Dijagnostika dijagnostika) {
        this.dijagnostika = dijagnostika;
    }
}
