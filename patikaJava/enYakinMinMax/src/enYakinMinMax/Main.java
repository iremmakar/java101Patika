package enYakinMinMax;

public class Main {

	public static void main(String[] args) {
		int[] arr = {15,12,788,1,-1,-778,2,0};
		int sayi = 5;
		
		int min1 = 999999999;
		int min2 = 999999999;
		int min3=0;
		int min4=0;
		
		for(int x: arr) {
			
			if(x<sayi) {
				int fark = sayi-x;
				if(fark<min1) {
					min1=fark;
					min3=x;
				}
			}
			
			if(x>sayi) {
				int fark = x-sayi;
				if(fark<min2) {
					min2=fark;
					min4=x;
				}
			}
		
		}
		
		System.out.println("En küçük en yakın:"+min3+"\nEn büyük en yakın:  "+min4);
		
		
		
		

	}

}
