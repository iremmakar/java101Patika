package mukemmelSayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int sum=0;
		int number;
		Scanner inp = new Scanner(System.in);
		
		number = inp.nextInt();
		
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				sum+=i;
			}
		}
		
		if(sum==number) {
			System.out.println("Mükemmel sayıdır.");
		}else {
			System.out.println("Mükemmel sayı değildir.");
		}
		
		
		

	}

}
