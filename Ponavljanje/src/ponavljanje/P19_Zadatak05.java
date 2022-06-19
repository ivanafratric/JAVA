package ponavljanje;

import javax.swing.JOptionPane;

public class P19_Zadatak05 {

	public static void main(String[] args) {

		int i = Integer.parseInt(
				JOptionPane.showInputDialog("Unesi broj"));
		
		if (i<1 || i>999) {
			System.out.println("Greska");
		} else { 
			if (i<10) {
				System.out.println(i);
		} else if (i>=10 && i<100) {
			System.out.println(i/10);
		} else {System.out.println(i/100);
		}
		}
	}

}
