package vjezbanje;

import javax.swing.JOptionPane;

public class Vjezba04 {

	public static void main(String[] args) {

		float prviBroj = Float.parseFloat(
				JOptionPane.showInputDialog("Unesi prvi broj")
				);
		
		float drugiBroj = Float.parseFloat(
				JOptionPane.showInputDialog("Unesi drugi broj")
				);
		
		float treciBroj = Float.parseFloat(
				JOptionPane.showInputDialog("Unesi treci broj")
				);
		
		float rezultat = prviBroj * treciBroj - drugiBroj;
		
		System.out.println(rezultat);
		
	}

}
