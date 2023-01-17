package daireDilimAlan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double yaricap;
		double merkezAci;
		double pi = 3.14;
		
		double alan;
		Scanner inp = new Scanner(System.in);
		yaricap = inp.nextDouble();
		merkezAci = inp.nextDouble();
		
		alan = (pi*(yaricap*yaricap)*merkezAci)/360;
		
		System.out.println(alan);
		

	}

}
