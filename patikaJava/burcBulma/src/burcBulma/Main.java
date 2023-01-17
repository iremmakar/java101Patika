package burcBulma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String burc="";
		int month, day;
		
		Scanner inp  = new Scanner(System.in);
		
		day = inp.nextInt();
		month = inp.nextInt();
		
		if(day<=31 && day>0) {
			if(month==1) {
				if(day<22) {
					burc ="oglak";
				}else {
					burc = "kova";
				}
			}
			if(month==2) {
				if(day<20) {
					burc = "kova";
				}else {
					burc = "balık";
				}	
			}
			if(month==3) {
				if(day<=20) {
					burc = "balık";
				}else {
					burc = "koc";
				}
			}
			if(month==4) {
				if(day<21) {
					burc="koc";
				}else {
					burc="boğa";
				}
			}
			if(month==5) {
				if(day<22) {
					burc = "boğa";
				}else {
					burc = "ikizler";
				}
			}
			if(month==6) {
				if(day<23) {
					burc="ikizler";
				}else {
					burc="yengeç";
				}
			}
			if(month==7) {
				if(day<23) {
					burc="yengeç";
				}else {
					burc="aslan";
				}
			}
			if(month==8) {
				if(day<23) {
					burc="aslan";
				}else {
					burc="başak";
				}
			}
			if(month==9) {
				if(day<23) {
					burc="başak";
				}else {
					burc="terazi";
				}
			}
			if(month==10) {
				if(day<23) {
					burc="terazi";
				}else {
					burc="akrep";
				}
			}
			if(month==11) {
				if(day<22) {
					burc="akrep";
				}else {
					burc="yay";
				}
			}
			if(month==12) {
				if(day<22) {
					burc="yay";
				}else {
					burc="oğlak";
				}
			}
			
			
			
			
			
		}
		System.out.println("Burcunuz: "+ burc);
		
		
		

	}

}
