package edunova;

import edunova.klase.Osoba;
import edunova.klase.Pravokutnik;
import edunova.klase.Predavac;

public class Start {
	
	public static void main(String[] args) {
		
		Pravokutnik p;
		
		p = new Pravokutnik(20,10);
	
		// p.setSirina(20);
		// p.setVisina(10);
		
		System.out.println(p.povrsina());
		
		Osoba o = new Osoba();
		o.setIme("Pero");
		o.setPrezime("Periæ");
		
		o = new Osoba ("Maja","Majiæ");
		
		Polaznik polaznik = new Polaznik();
		
		Predavac predavac = new Predavac();
		
	
	}

}
