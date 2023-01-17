package usluSayilar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int taban,us;
		int total = 1;
		Scanner inp = new Scanner(System.in);
		
		taban = inp.nextInt();
		us = inp.nextInt();
		
		for(int i = 0;i<us;i++) {
			total*=taban;
		}
		
		System.out.println(total);
		
		
		
		
		
		
		

	}

}
