package java03;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class J02String {

	public static void main(java.lang.String[] args) {

		String s = JOptionPane.showInputDialog("Unesi svoje ime");
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(s.length()-1));
		System.out.println();
		
		String ime = new String();
		
		String grad="Osijek";
		
		System.out.println(grad.hashCode());
		System.out.println(grad.hashCode());
		
		grad="Donji Miholjac";
		
		System.out.println(grad.hashCode());
		
		String[] parametri = new String[12];
		
		parametri [0] = "Edunova";
		parametri [1] = new String("Osijek");
		
		System.out.println(Arrays.toString(parametri));
		
		System.out.println(parametri[1].charAt(0));
		
		
		
	}

}
