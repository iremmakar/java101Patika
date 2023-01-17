package minMaxBulma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Kaç tane sayı giriceksiniz?");
		int number = inp.nextInt();
		int numbers;
		System.out.println("1. sayıyı giriniz: ");
		numbers=inp.nextInt();
		int min = numbers;
		int max= numbers;
		
		for(int i = 1;i<number;i++) {
			System.out.println((i+1)+". sayıyı giriniz: ");
			numbers=inp.nextInt();
			if(numbers<min) {
				min=numbers;
			}
			if(numbers>max) {
				max=numbers;
			}
			
		}
		
		System.out.println("En büyük sayı: "+max);
		System.out.println("En küçük sayı: "+min);
		
		
		

	}

}
