package recursiveUs;

public class Main {
	
	static int us(int a,int b) {
		
		
		if(b==0) {
			return 1;
		}else {
			b=b-1;
			return a*us(a,b);
		}
		
		
	
	}
	

	public static void main(String[] args) {
		System.out.println(us(3,5));

	}

}
