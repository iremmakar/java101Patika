package artikYil;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int yil;
		Scanner inp  =new Scanner(System.in);
		yil = inp.nextInt();
		
		if(yil%4==0) {
			if(yil%100==0) {
				if(yil%400==0) {
					System.out.println("Artık yıldır."+ yil);
				}else {
					System.out.println("Artık yıl değildir."+ yil);
				}
				
				
			}else {
				System.out.println("Artık yıldır."+ yil);
				
			}
		}else {
			System.out.println("Artık yıl değildir."+yil);
		}

	}

}
