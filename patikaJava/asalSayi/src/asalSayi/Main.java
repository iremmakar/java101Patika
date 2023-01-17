package asalSayi;

public class Main {

	public static void main(String[] args) {
		
		int counter = 0;
		
		for(int x=2;x<=100;x++) {
			for(int y=2;y<x;y++) {
				if(x%y==0) {
					counter=1;	
				}
				
			}
			if(counter!=1) {
				System.out.println(x+" ");
			}
			counter=0;
			
		}
		

	}

}
