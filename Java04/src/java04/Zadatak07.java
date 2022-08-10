package java04;

import javax.swing.JOptionPane;

public class Zadatak07 {
	
	public static void main(String[] args) {
		
		// program osigurava unos niza znakova (String) koji ima minimalno 3 znaka
		// ako nema tri znaka ispisuje korisniku poruku: Minimalno 3 znaka
		
		String s;
		while(true) {
			s = JOptionPane.showInputDialog("Unesi minimalno 3 znaka");
			if (s.length()<3) {
				JOptionPane.showMessageDialog(null, "Mora biti minimalno 3 znaka");
				continue;
			}
				break;
		}
	
		System.out.println(s);
	}

}
