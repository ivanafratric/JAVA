package java04;

import javax.swing.JOptionPane;

public class Zadatak04 {
	
	public static void main(String[] args) {
		
		// za upisani cijeli broj ispi�i zbroj svih znamenki
		// ulaz: 263736 -> izlaz: 27
		// ulaz: 26 -> izlaz: 8
		
		int i=0;
		int suma=0;
		i = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		
		while(i>0) {
			suma+=i%10;
			
			i=i/10;
		}
		System.out.println(suma);
	}

}
