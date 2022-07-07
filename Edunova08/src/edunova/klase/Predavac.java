package edunova.klase;

public class Predavac extends Osoba {
	
	private String iban;
	
	public Predavac() {
		super();
	}
	
	public Predavac(String iban) {
		super();
		this.iban = iban;
	}



	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + iban;

 	}

}
