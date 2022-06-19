package java02;

import javax.swing.JOptionPane;

public class Zadatak06 {

	public static void main(String[] args) {

		int i = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi broj"));
		
		int j = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi broj"));
		
		if (i%2 == 0 && j%2 == 0) {
			System.out.println(i+j);
		} else {System.out.println(i-j);
		}
								
		
	}

}
