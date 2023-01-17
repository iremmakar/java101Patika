package atmProjesi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		String userName, password;
		int right = 3;
		int balance = 1500;
		int select;
		
		while(right>0) {
			
			System.out.println("Kullanıcı adınız: ");
			userName = inp.nextLine();
			System.out.println("Parolanız: ");
			password = inp.nextLine();
			
			if(userName.equals("patika") && password.equals("dev123")) {
				System.out.println("Merhaba kodluyoruz bankasına hoşgeldin.");
				System.out.println("1-Para Yatırma\n"+
				"2-Para Çekme\n"+
				"3-Bakiye Sorgula"+
				"4-Çıkış Yap"
						);
				
				
				
				do {
					System.out.println("Lütfen işlem seçin");
					select = inp.nextInt();
				switch(select) {
				case 1:
					System.out.println("Para miktarı: ");
					int price = inp.nextInt();
					balance+=price;
					break;
				case 2:
					System.out.print("Para miktarı : ");
                    int price2 = inp.nextInt();
                    if (price2 > balance) {
                        System.out.println("Bakiye yetersiz.");
                    } else {
                        balance -= price2;
                    }
                    break;
				case 3:
					 System.out.println("Bakiyeniz : " + balance);
					 break;
					
				}
				}while(select!=4);
				System.out.println("Tekrar görüşmek üzere.");
				break;
				
				
			}else {
				right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                }else {
                	System.out.println("Kalan Hakkınız : " + right);
                }
			
			
			
			
			
			
		}
		
		
		
		
		
		
		

	}

}
}
