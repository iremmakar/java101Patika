package ebobEkok;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inp  =new Scanner(System.in);
		int n1 = inp.nextInt();
		int n2 = inp.nextInt();
		int x=0,y=0;
		
		int min,max;
		int ebob=0;
		
		if(n1<n2) {
			min = n1;
			max=n2;
			x=1;
		}else {
			min = n2;
			max=n1;
			y=1;
		}
		
		int i = 1,j=1;
		
		while(i<=min) {
			
			if(min%i==0 && x==1 && n2%i==0) {
				ebob=i;
			}else if(min%i==0 && y==1 && n1%i==0){
				ebob=i;
			}
			i++;
		}
		System.out.println("Ebob: "+ebob);
		
		int ekok;
		
		ekok = (n1*n2)/ebob;
		
		System.out.println("Ekok: "+ekok);
		
		

	}

}
