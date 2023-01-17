package havaEtkinlik;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int heat;
		
		Scanner inp = new Scanner(System.in);
		heat = inp.nextInt();
		
		if(heat<5) {
			System.out.println("Kayak yapabilirsiniz.");
		}
		
		if(heat>=5 && heat<=15 ) {
			System.out.println("Sinemaya gidebilirsiniz.");
		}
		
		if(heat>=10 && heat<=25) {
			System.out.println("Pikniğe gidebilirsiniz.");
		}
		
		if(heat>=25) {
			System.out.println("Yüzmeye gidebilirsiniz.");
		}

	}

}
