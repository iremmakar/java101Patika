package ucakBiletFiyat;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int mesafe;
		int yas;
		int tip;
		double tutar = 0;
		double indirim;
		
		Scanner inp = new Scanner(System.in);
		
		mesafe = inp.nextInt();
		yas= inp.nextInt();
		tip = inp.nextInt();
		
		if(mesafe>0 && yas>0 && (tip==1 || tip==2)) {
			tutar = mesafe * 0.10;
			if(yas < 12) {
				 tutar -= tutar* 0.50;
				 if(tip==2) {
					 tutar-=tutar*0.20;
					 tutar *=2;
				 }
			}
			else if(yas > 12 && yas<24) {
				tutar-=tutar*0.10;
				if(tip==2) {
					 tutar-=tutar*0.20;
					 tutar *=2;
				 }
			}
			else if(yas > 65){
				tutar-=tutar*0.30;
				if(tip==2) {
					 tutar-=tutar*0.20;
					 tutar *=2;
				 }
			}
			
			else {
				tutar = tutar;
				if(tip==2) {
					 tutar-=tutar*0.20;
					 tutar *=2;
				 }
			}
			
			
			
			
			System.out.println("Toplam tutar = "+tutar);	
			
		}else {
			System.out.println("Hatalı Veri Girdiniz !");
		}
		
		
		
		
		

		
		
	}

}
