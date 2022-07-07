package ponavljanje;

import javax.swing.JOptionPane;

public class P15_Zadatak01 {

	public static void main(String[] args) {

		int i = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi broj"));

		int j = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi drugi broj"));

		if (i+j>10) {
			System.out.println("Osijek");
		} else {System.out.println("Edunova");
		}

	}

}
