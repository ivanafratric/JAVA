package edunova.zadatak2;

public class Racunalo {
	
	private String proizvodac;
	private String vrstaPrikljucka;
	
	public Racunalo() {
		super();
	}
	
	
	
	public Racunalo(String proizvodac, String vrstaPrikljucka) {
		super();
		this.proizvodac = proizvodac;
		this.vrstaPrikljucka = vrstaPrikljucka;
	}



	public String getProizvodac() {
		return proizvodac;
	}
	public void setProizvodac(String proizvodac) {
		this.proizvodac = proizvodac;
	}
	public String getVrstaPrikljucka() {
		return vrstaPrikljucka;
	}
	public void setVrstaPrikljucka(String vrstaPrikljucka) {
		this.vrstaPrikljucka = vrstaPrikljucka;
	}
	
	
	

}
