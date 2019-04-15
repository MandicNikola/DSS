package model;

public class Terapija {

	private String naziv;
	private String vrsta;
	private int trajanjeTerapije;

	
	
	public Terapija() {
		super();
	}

	public Terapija(String naziv, String vrsta, int trajanjeTerapije) {
		super();
		this.naziv = naziv;
		this.vrsta = vrsta;
		this.trajanjeTerapije = trajanjeTerapije;
	}
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getVrsta() {
		return vrsta;
	}
	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}
	public int getTrajanjeTerapije() {
		return trajanjeTerapije;
	}
	public void setTrajanjeTerapije(int trajanjeTerapije) {
		this.trajanjeTerapije = trajanjeTerapije;
	}
	
	
	
	
	
}
