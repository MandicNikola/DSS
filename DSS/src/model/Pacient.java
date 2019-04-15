package model;

import java.util.Collections;
import java.util.List;

public class Pacient {

	private String ime;
	private String prezime;
	private int starost;
	private int godiste;
	private int jmbg;
	
	private List<Pregled> pregledi;
	
	
	public Pacient()
	{
		
	}
	
	public Pacient(String ime, String prezime, int starost, int godiste, int jmbg, List<Pregled> pregledi) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.starost = starost;
		this.godiste = godiste;
		this.jmbg = jmbg;
		Collections.sort(pregledi);
		this.pregledi = pregledi;
		
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getStarost() {
		return starost;
	}

	public void setStarost(int starost) {
		this.starost = starost;
	}

	public int getGodiste() {
		return godiste;
	}

	public void setGodiste(int godiste) {
		this.godiste = godiste;
	}

	public int getJmbg() {
		return jmbg;
	}

	public void setJmbg(int jmbg) {
		this.jmbg = jmbg;
	}

	public List<Pregled> getPregledi() {
		return pregledi;
	}

	public void setPregledi(List<Pregled> pregledi) {
		this.pregledi = pregledi;
	}
	
	
	
	
}
