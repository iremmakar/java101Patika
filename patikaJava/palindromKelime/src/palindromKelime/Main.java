package palindromKelime;

public class Main {

	public static void main(String[] args) {
		String x = "abbba";
		int count=0;
		int uzunluk = x.length();
		int boyut=x.length()/2;
		int uzunluk2=x.length()-1;
		
		for(int i =0;i<uzunluk/2;i++) {
			if(x.charAt(i)==x.charAt(uzunluk2)) {
				count++;
			}
			uzunluk2--;
		}
		
		if(count==boyut) {
			System.out.println("palindrom");
		}else{
		    System.out.println("not palindrom");
		}
		
	}

}
