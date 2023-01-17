package kullaniciGiris;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String username, password;
		String cevap;
		
		Scanner inp = new Scanner(System.in);
		username = inp.nextLine();
		password = inp.nextLine();
		
		if(password.equals("1234")) {
			System.out.println("Başarılı giriş yaptınız. ");
		}else {
			System.out.println("Şifreyi sıfırlamak ister misiniz?");
			cevap = inp.nextLine();
			
			if(cevap.equals("evet")) {
				String newPassword = inp.nextLine();
				if(newPassword.equals(password)) {
					System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
				}else {
					System.out.println("Şifre oluşturuldu.");
				}
				
			}
		}
		
		
	}

}
