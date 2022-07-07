package edunova.zadatak2;

public class Televizor extends Uredaj {
	
	private String vrstaDaljinskog;
	
	

	public Televizor() {
		super();
	}

	public Televizor(String vrstaDaljinskog) {
		super();
		this.vrstaDaljinskog = vrstaDaljinskog;
	}

	public String getVrstaDaljinskog() {
		return vrstaDaljinskog;
	}

	public void setVrstaDaljinskog(String vrstaDaljinskog) {
		this.vrstaDaljinskog = vrstaDaljinskog;
	}
	
	
	
}
