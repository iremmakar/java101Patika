package tersUcgen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number;
		Scanner inp = new Scanner(System.in);
		
		number = inp.nextInt();
		int number2 = number;
		number+=(number-1);
		
		for(int i = 0;i<number;i++) {
			System.out.print("*");
		}
		
		
		int c=1;
		number-=2;
		System.out.println();
		
		for(int j=1;j<number2;j++) {
			
			for(int i = 0;i<c;i++) {
				System.out.print(" ");
			}
			
			for(int x=0;x<number;x++) {
				System.out.print("*");
			}
			
			c++;
			number-=2;
			System.out.println();
			
			
			
		}
		
		

	}

}
