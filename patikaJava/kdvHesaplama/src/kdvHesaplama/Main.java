package kdvHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int tutar;
		Scanner inp = new Scanner(System.in);
		System.out.println("Tutar giriniz: ");
		tutar = inp.nextInt();
		double kdvTutar;
		double kdvMiktari;
		
		if(tutar>0 && tutar<=1000) {
			kdvTutar = (tutar*0.18)+tutar;
			kdvMiktari = tutar*0.18;
			System.out.println("KDV'li fiyat: " + kdvTutar);
			System.out.println("KDV tutarı: " + kdvMiktari);
		}else {
			kdvTutar = (tutar*0.08)+tutar;
			kdvMiktari = tutar*0.08;
			System.out.println("KDV'li fiyat: " + kdvTutar);
			System.out.println("KDV tutarı: " + kdvMiktari);
		}
		
		

	}

}
