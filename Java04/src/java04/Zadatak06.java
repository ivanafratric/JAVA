package java04;

public class Zadatak06 {
	
	public static void main(String[] args) {
		
		// Za dani jednodimenzinalni niz cijelih brojeva program ispisuje najveæi
		
		int[] niz = { 5, 5, 8, 6, -6, 8, -1, 0, 9, 0 };
		// 9
		
		int najveci = Integer.MIN_VALUE;
		for (int i=0;i<niz.length;i++) {
			if(i>najveci) {
				najveci = i;
			}
		}
		
		System.out.println(najveci);
		
	}

}
