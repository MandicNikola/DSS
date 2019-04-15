package model;

import java.util.Date;
import java.util.List;

public class Pregled implements Comparable<Pregled>{

	private Date datumPregleda;
	private String dijagnoza;
	private Terapija terapija;
	private List<String> simptomi;
	
	
	public Pregled()
	{
		
	}
		
	public Pregled(Date datumPregleda, String dijagnoza, Terapija terapija) {
		super();
		this.datumPregleda = datumPregleda;
		this.dijagnoza = dijagnoza;
		this.terapija = terapija;
	}

	public Date getDatumPregleda() {
		return datumPregleda;
	}
	public void setDatumPregleda(Date datumPregleda) {
		this.datumPregleda = datumPregleda;
	}
	public String getDijagnoza() {
		return dijagnoza;
	}
	public void setDijagnoza(String dijagnoza) {
		this.dijagnoza = dijagnoza;
	}
	public Terapija getTerapija() {
		return terapija;
	}
	public void setTerapija(Terapija terapija) {
		this.terapija = terapija;
	}

	public List<String> getSimptomi() {
		return simptomi;
	}

	public void setSimptomi(List<String> simptomi) {
		this.simptomi = simptomi;
	}

	//radi sorta po datumima klasa
	@Override
	public int compareTo(Pregled o) {
		// TODO Auto-generated method stub
		return this.getDatumPregleda().compareTo(o.getDatumPregleda());
	}
	
	
	
	
}
