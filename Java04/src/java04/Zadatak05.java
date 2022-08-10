package java04;

import javax.swing.JOptionPane;

public class Zadatak05 {
	
	public static void main(String[] args) {
		
		// program prima dva cijela broja 
		//ispisuje sve prim brojeve izmeðu dva primljena broja
		
		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		int min = i < j ? i : j;
		int max = i > j ? i : j;
		
		boolean prim;
		
		for(int a=min; a<=max; a++) {
			prim = true;
			
			for (int b=2;b<a;b++) {
				if (a%b==0) {
					prim=false;
					break;
				}
			}
			
			if (prim) {
				System.out.println(a);
			}
		}
		
	}

}
