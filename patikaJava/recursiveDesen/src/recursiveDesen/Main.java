package recursiveDesen;

public class Main {
	
	static int desen(int number,int temp,int y) {
		
		final int x= number;
		
		if(temp>0 && temp!=x && y!=1) {
			System.out.println(temp);
			return desen(x,temp-5,y);
		}else if (temp>0 && temp==x && y!=1){
			System.out.println(temp);
			return desen(x,temp-5,y);
		}else if(temp<=0){
			y=1;
			System.out.println(temp);
			return desen(x,temp+5,y);
		}else if(temp>=0 && y==1 && temp!=x) {
			System.out.println(temp);
			return desen(x,temp+5,y);
		}
		else {
			System.out.println(temp);
			return temp;
		}	
	}
	
	

	public static void main(String[] args) {
		desen(16,16,0);

	}

}

