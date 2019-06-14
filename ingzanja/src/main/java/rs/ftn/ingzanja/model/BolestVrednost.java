package rs.ftn.ingzanja.model;

public class BolestVrednost {
    private String bolest;
    private Float vrednost;

    public BolestVrednost(){

    }

    public BolestVrednost(String bolest, Float vrednost) {
        this.bolest = bolest;
        this.vrednost = vrednost;
    }

    public String getBolest() {
        return bolest;
    }

    public Float getVrednost() {
        return vrednost;
    }

    public void setBolest(String bolest) {
        this.bolest = bolest;
    }

    public void setVrednost(Float vrednost) {
        this.vrednost = vrednost;
    }
}
