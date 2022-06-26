package ponavljanje;

import javax.swing.JOptionPane;

public class P25_Zadatak01 {

	public static void main(String[] args) {

		int[] niz = new int[4];
		
		int suma=0;
		for(int i=0;i<4;i++) {
			niz[i]=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		
		suma+=niz[i]; 
	}
		System.out.println(suma);
		
	}

}
