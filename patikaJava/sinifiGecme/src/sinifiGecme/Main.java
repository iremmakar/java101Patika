package sinifiGecme;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double mat, fizik, turkce, kimya, muzik;
		int counter = 5;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Matematik notu giriniz.");
		mat = inp.nextInt();
		
		if(mat>100 || mat<0 ) {
			mat = 0;
			counter--;
		}
		
		System.out.println("Fizik notu giriniz.");
		fizik = inp.nextInt();
		
		if(fizik>100 || fizik<0 ) {
			fizik = 0;
			counter--;
		}
		
		System.out.println("Türkçe notu giriniz.");
		turkce = inp.nextInt();
		
		if(turkce>100 || turkce<0 ) {
			turkce = 0;
			counter--;
		}
		
		System.out.println("Kimya notu giriniz.");
		kimya = inp.nextInt();
		
		if(kimya>100 || kimya<0 ) {
			kimya = 0;
			counter--;
		}
		
		System.out.println("Müzik notu giriniz.");
		muzik = inp.nextInt();
		
		if(muzik>100 || muzik<0 ) {
			muzik = 0;
			counter--;
		}
		
		double average;
		
		average = (mat+fizik+turkce+kimya+muzik)/counter;
		
		System.out.println(average);
		
		

	}

}
