package manavKasa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Armut kaç kilo? ");
		double kiloArmut = inp.nextDouble();
		
		System.out.println("Elma kaç kilo? ");
		double kiloElma = inp.nextDouble();
		
		System.out.println("Domates kaç kilo? ");
		double kiloDomates = inp.nextDouble();
		
		System.out.println("Muz kaç kilo? ");
		double kiloMuz = inp.nextDouble();
		
		System.out.println("Patlıcan kaç kilo? ");
		double kiloPatlican = inp.nextDouble();
		
		double tutar;
		
		tutar = (kiloArmut*2.14)+(kiloElma*3.67)+(kiloDomates*1.11)+(kiloMuz*0.95)+(kiloPatlican*5.00);
		
		System.out.println(tutar);
		
		
		

	}

}
