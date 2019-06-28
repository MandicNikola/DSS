package rs.ftn.ingzanja.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import rs.ftn.ingzanja.model.Pol;
import rs.ftn.ingzanja.model.Simptom;
import ucm.gaia.jcolibri.cbrcore.Attribute;
import ucm.gaia.jcolibri.cbrcore.CaseComponent;

public class CBRModel implements CaseComponent {


    private Long id;

    private String pol;
    private int godine;

    private String simptom;


    private String dijagnoza;
    private String terapija;
    private String dijagnostika;






    public String getDijagnoza() {
        return dijagnoza;
    }

    /**
     * @param dijagnoza the dijagnoza to set
     */
    public void setDijagnoza(String dijagnoza) {
        this.dijagnoza = dijagnoza;
    }

    /**
     * @return the terapija
     */
    public String getTerapija() {
        return terapija;
    }

    /**
     * @param terapija the terapija to set
     */
    public void setTerapija(String terapija) {
        this.terapija = terapija;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "CBRModel [pol=" + pol + ", godine=" + godine + ", simptomi=" + simptom + "]";
    }




    /**
     * @return the pol
     */
    public String getPol() {
        return pol;
    }

    /**
     * @param pol the pol to set
     */
    public void setPol(String pol) {
        this.pol = pol;
    }

    /**
     * @return the godine
     */
    public int getGodine() {
        return godine;
    }

    /**
     * @param godine the godine to set
     */
    public void setGodine(int godine) {
        this.godine = godine;
    }





    @Override
    public Attribute getIdAttribute() {
        // TODO Auto-generated method stub
        return null;
    }


    public String getDijagnostika() {
        return dijagnostika;
    }

    public void setDijagnostika(String dijagnostika) {
        this.dijagnostika = dijagnostika;
    }

    public String getSimptom() {
        return simptom;
    }

    public void setSimptom(String simptom) {
        this.simptom = simptom;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
