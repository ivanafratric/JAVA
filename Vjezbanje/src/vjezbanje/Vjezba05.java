package vjezbanje;

import javax.swing.JOptionPane;

public class Vjezba05 {

	public static void main(String[] args) {

		int i = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi dvoznamenkasti broj")
				);
		i%=10;
		
		System.out.println(i);
		
		int j = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi dvoznamenkasti broj")
				);
		j/=10;
		
		System.out.println(j);
				
		
	}

}
