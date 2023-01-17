package basamakSayisiToplami;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number;
		Scanner inp = new Scanner(System.in);
		number = inp.nextInt();
		int total = 0;
		
		while(number!=0)
		{
			total+=number%10;
			number/=10;	
		}
		
		System.out.println(total);
		
		

	}

}
