package ucgenAlan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a,b,c;
		int u;
		
		Scanner inp = new Scanner(System.in);
		a = inp.nextInt();
		b = inp.nextInt();
		c = inp.nextInt();
		
		u = (a+b+c)/2;
		
		double alan;
		double alan2 = u*(u-a)*(u-b)*(u-c);
		
		alan = Math.sqrt(alan2);
		System.out.println(alan);
	}

}
