package ponavljanje;

import javax.swing.JOptionPane;

public class P04_PrviProgram {

	public static void main(String[] args) {

		String UnosOdKorisnika = JOptionPane.showInputDialog("Unesi broj");

		int b = Integer.parseInt(UnosOdKorisnika);

		System.out.println(b);

	}

}
