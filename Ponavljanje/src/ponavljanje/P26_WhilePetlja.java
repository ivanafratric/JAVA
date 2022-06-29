package ponavljanje;

public class P26_WhilePetlja {

	public static void main(String[] args) {
		
		//beskonacna petlja
		while(true) {
			break;
		}
		
		int i=0;
		while(i<10) {
			if(i+1==2) {
				i++;
				continue;
			}
			System.out.println(++i);
		}
		
		//u for petlju se ne mora uci
		for(int t=10;t>10;t++) {
			System.out.println("Osijek");
		}
		
		//u while petlju se ne mora uci
		int t=2;
		while(t>2) {
			System.out.println("Edunova");
			
		}
		
	}

}
