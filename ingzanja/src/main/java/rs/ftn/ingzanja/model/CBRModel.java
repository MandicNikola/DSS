package rs.ftn.ingzanja.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import rs.ftn.ingzanja.model.Pol;
import rs.ftn.ingzanja.model.Simptom;
import ucm.gaia.jcolibri.cbrcore.Attribute;
import ucm.gaia.jcolibri.cbrcore.CaseComponent;

public class CBRModel implements CaseComponent {


    private Pol pol;
    private int godine;

    private Set<Simptom> simptomi ;
    private String dijagnoza;
    private String terapija;
    private Dijagnostika dijagnostika;

    public void setDijagnostika(Dijagnostika dijagnostika){

        this.dijagnostika= dijagnostika;
    }

    public Dijagnostika getDijagnostika(){
        return dijagnostika;
    }
    /**
     * @return the dijagnoza
     */
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
        return "CBRModel [pol=" + pol + ", godine=" + godine + ", simptomi=" + simptomi + "]";
    }




    /**
     * @return the pol
     */
    public Pol getPol() {
        return pol;
    }

    /**
     * @param pol the pol to set
     */
    public void setPol(Pol pol) {
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

    /**
     * @return the simptomi
     */
    public Set<Simptom> getSimptomi() {
        return simptomi;
    }

    /**
     * @param set the simptomi to set
     */
    public void setSimptomi(Set<Simptom> set) {
        this.simptomi = set;
    }

    @Override
    public Attribute getIdAttribute() {
        // TODO Auto-generated method stub
        return null;
    }







}
