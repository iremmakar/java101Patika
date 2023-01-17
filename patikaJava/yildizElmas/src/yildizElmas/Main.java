package yildizElmas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number;
		Scanner inp = new Scanner(System.in);
		
		number = inp.nextInt();
		int x = number;
		int c1=1,c2=1;
		
		for(int i = 0;i<number;i++) {
			
			for(int y = 0;y<x-1;y++) {
				System.out.print(" ");
				
			}
			for(int z = 0;z<c1;z++) {
				System.out.print("*");
				
			}
			System.out.println();
			x-=1;
			c1+=2;	
		}
		
		c1-=4;
		
		for(int i =0;i<number-1;i++) {
			
			for(int y = 0;y<c2;y++) {
				System.out.print(" ");
			}
			
			for(int z=0;z<c1;z++) {
				System.out.print("*");
			}
			
			c2++;
			c1-=2;
			System.out.println();
			
		}
		
		
		

	}

}
