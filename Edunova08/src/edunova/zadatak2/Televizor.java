package edunova.zadatak2;

public class Televizor {
	
	private String proizvodac;
	private String vrstaDaljinskog;
	
	public Televizor() {
		super();
	}
	
	
	
	public Televizor(String proizvodac, String vrstaDaljinskog) {
		super();
		this.proizvodac = proizvodac;
		this.vrstaDaljinskog = vrstaDaljinskog;
	}



	public String getProizvodac() {
		return proizvodac;
	}
	public void setProizvodac(String proizvodac) {
		this.proizvodac = proizvodac;
	}
	public String getVrstaDaljinskog() {
		return vrstaDaljinskog;
	}
	public void setVrstaDaljinskog(String vrstaDaljinskog) {
		this.vrstaDaljinskog = vrstaDaljinskog;
	}
	
	

}
