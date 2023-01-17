package kombinasyon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		int n,r,fn=1,fr=1,fnr=1;
		
		n=inp.nextInt();
		r=inp.nextInt();
		
		for(int i = 1;i<=n;i++) {
			fn*=i;
		}
		
		
		for(int i = 1;i<=r;i++) {
			fr*=i;
		}
		
		for(int i = 1;i<=n-r;i++) {
			fnr*=i;
		}
		
		double komb;
		
		komb = fn/(fr*fnr);
		System.out.println(komb);
		

	}

}
