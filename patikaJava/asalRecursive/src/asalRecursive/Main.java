package asalRecursive;

public class Main {

	static boolean asal(int number,int c) {
		if(number%c==0) {
			System.out.println(number+"sayısı asal değildir");
			return true;
		}else {
			c++;
			if(c==(number-1)){
				System.out.println(number+"sayısı asaldır");
				return false;
			}
			return asal(number,c);
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		asal(17,2);

	}

}
