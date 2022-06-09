package vjezbanje;

import javax.swing.JOptionPane;

public class Vjezba02 {

	public static void main(String[] args) {

		String unosOdKorisnika = JOptionPane.showInputDialog("Unesi broj");
		
		int b = Integer.parseInt(unosOdKorisnika);
		
		System.out.println(b);
		
	}

}
