package mayinTarlasi;

import java.util.Scanner;

public class MineSweeper {
	int rowNumber;
	int colNumber;
	
	MineSweeper(int row,int col){
		this.rowNumber=row;
		this.colNumber=col;
	}

	public String[][] mayinKonum() {
		int mayin = (this.rowNumber*this.colNumber)/4;
		String mayinArr[][]=new String[this.rowNumber][this.colNumber];

		for(int j=0;j<mayin;j++) {
			int x= (int)(Math.random()*this.rowNumber);
			int y=(int)(Math.random()*this.colNumber);
			
			
			if(mayinArr[x][y]!="*") {
			mayinArr[x][y]="*";
			}else {
				j--;
				
			}	
		}
		
		for(int x=0;x<rowNumber;x++) {
			for(int y=0;y<colNumber;y++) {
				
				if(mayinArr[x][y]!="*") {
					mayinArr[x][y]="-";
				}
				System.out.print(mayinArr[x][y]);
			}
			System.out.println();
		}	
		return mayinArr;
	}
	
	public boolean run() {
		String arr[][] = mayinKonum();
		
		Scanner scan = new Scanner(System.in);
		String arr2[][] =new String[this.rowNumber][this.colNumber];
		
		for(int e=0;e<this.rowNumber;e++) {
			for(int r=0;r<this.colNumber;r++) {
				arr2[e][r]="-";
			}
			System.out.println();
		}
		
		
		int count=0,count1=0;
		
		do {	
				System.out.print("Satır giriniz : ");
				int x=scan.nextInt();
				System.out.println();
				System.out.print("Sütun giriniz : ");
				int y=scan.nextInt();
				int a=x-1;
				int b=y-1;
				count1++;
				
				if(arr[x][y]=="*") {
					System.out.println("Game over");
					return false;
				}
				
				
				if(a!=this.rowNumber && b!=this.colNumber) {
					if(a>=0 && b>=0) {
					if(arr[a][b]=="*") {
						count++;
						
					}
					}
					
					if(a>=0 ) {
					if(arr[a][y]=="*") {
						count++;
						
					}
					}
					
					if(a>=0 && y+1!=this.colNumber ) {
					if(arr[a][y+1]=="*") {
						count++;
						
					}
					}
					
					if(b>=0) {
					if(arr[x][b]=="*") {
						count++;
						
					}
					}
					
					if(x+1!=this.rowNumber && b>=0) {
					if(arr[x+1][b]=="*") {
						count++;
						
					}
					}
					
					if(x+1!=this.rowNumber) {
					if(arr[x+1][y]=="*") {
						count++;
						
					}
					}
					
					if(x+1!=this.rowNumber && y+1!=this.colNumber) {
					if(arr[x+1][y+1]=="*") {
						count++;
						
					}
					}
					
					if(y+1!=this.colNumber) {
					if(arr[x][y+1]=="*") {
						count++;
					
					}
					}
					
					
					
				}
				
				arr2[x][y]=Integer.toString(count);
				count=0;
				for(int e=0;e<this.rowNumber;e++) {
					for(int r=0;r<this.colNumber;r++) {
						System.out.print(arr2[e][r]+" ");
					}
					System.out.println();
				}
				
		}while(rowNumber*colNumber-count1!=rowNumber*colNumber/4);	
				
			System.out.println("Oyunu kazandınız !");	
			return true;	
				
		
		
	
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
