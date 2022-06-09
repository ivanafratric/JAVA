package vjezbanje;

import javax.swing.JOptionPane;

public class Vjezba03 {

	public static void main(String[] args) {

		int prviBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi prvi broj")
				);
		
		int drugiBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi drugi broj")
				);
		
		int rezultat = prviBroj + drugiBroj;
		
		System.out.println(rezultat);
		
	}

}
