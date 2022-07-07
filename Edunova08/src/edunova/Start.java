package edunova;

import edunova.klase.Pravokutnik;

public class Start {
	
	public static void main(String[] args) {
		
		Pravokutnik p;
		
		p = new Pravokutnik();
	
		p.setSirina(20);
		p.setVisina(10);
		
		System.out.println(p.povrsina());
	
	}

}
