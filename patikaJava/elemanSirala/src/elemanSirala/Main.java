package elemanSirala;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Dizi boyutunu giriniz:");
		Scanner scan = new Scanner(System.in);
		int boyut= scan.nextInt();
		int[] number = new int[boyut];
		
		for(int i =0;i<boyut;i++) {
			int eleman = scan.nextInt();
			System.out.println(i+". Eleman : "+eleman);
			number[i] = eleman;
		}
		
		for(int x=0;x<boyut;x++) {
			for(int y=x+1;y<boyut;y++) {
				if(number[x]>number[y]) {
					int temp = number[x];
					number[x] = number[y];
					number[y] = temp;
			}
		}
		}
			
		for(int num:number) {
			System.out.println(num);
		}
		

	

}
}
