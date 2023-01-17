package ucVeDortTamBolunen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number ;
		int sum = 0;
		int counter=0;
		
		Scanner inp = new Scanner(System.in);
		number= inp.nextInt();
		
		for(int x = 1;x<number;x++) {
			if(x%3==0 && x%4==0) {
				sum+=x;
				counter++;
			}
		}
		
		double average;
		average=sum/counter;
		
		System.out.println(average);

	}

}
