package dortVeBesinKuvvetleri;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		int number = inp.nextInt();
		
		System.out.println("4'ün kuvvetleri");
		for(int i = 1; i<number;i*=4) {
			System.out.println(i);
		}
		
		System.out.println("5'in kuvvetleri");
		for(int i = 1; i<number;i*=5) {
			System.out.println(i);
		}
		
		

	}

}
