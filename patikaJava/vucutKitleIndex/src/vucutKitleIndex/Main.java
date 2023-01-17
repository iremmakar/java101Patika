package vucutKitleIndex;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double index;
		double boy,kilo;
		
		Scanner inp = new Scanner(System.in);
		
		boy = inp.nextDouble();
		kilo = inp.nextDouble();
		
		index= kilo/(boy*boy);
		System.out.println(index);

	}

}
