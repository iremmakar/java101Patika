package harmonikSayilar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double result = 0;
		int number;
		Scanner inp = new Scanner(System.in);
		
		number = inp.nextInt();
		
		for(int i=1;i<=number;i++) {
			result+=1.0/i;
		}
		System.out.println(result);
		
		

	}

}
