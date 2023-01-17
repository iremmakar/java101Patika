package matrixTranspoze;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[][] mat = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12}
				
		};
		
		int[][] mat2 = new int[3][4];
		int x=0,y=0;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				mat2[i][j]=mat[x][y];
				x++;
			}
			x=0;
			y++;
		}
		
		for(int i=0;i<mat2.length;i++) {
			for(int j=0;j<mat2[i].length;j++) {
				System.out.print(mat2[i][j]);
			}
			System.out.println();
		}
		
		
		
		

	}

}
