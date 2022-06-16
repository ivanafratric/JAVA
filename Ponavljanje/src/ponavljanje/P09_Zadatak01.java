package ponavljanje;

import javax.swing.JOptionPane;

public class P09_Zadatak01 {

	public static void main(String[] args) {

		int prviBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi prvi broj"));
		
		int drugiBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi drugi broj"));
		
		int treciBroj = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi treci broj"));
		
		int rezultat = prviBroj * treciBroj - drugiBroj;
		
		System.out.println(rezultat);
		
	}

}
