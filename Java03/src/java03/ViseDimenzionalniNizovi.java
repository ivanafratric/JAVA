package java03;

public class ViseDimenzionalniNizovi {

	public static void main(String[] args) {

		int[][] matrica = new int[10][10];
		
		matrica [9][9] = 7;
		
		int [][] tablica = {
				{1,0,0},
				{0,1,0},
				{0,0,1}
		};
		
		int [][][] kocka = new int [10][10][10];
		
		System.out.println(tablica);
		
		System.out.println(kocka);
		
		System.out.println(matrica);
		
	}

}
