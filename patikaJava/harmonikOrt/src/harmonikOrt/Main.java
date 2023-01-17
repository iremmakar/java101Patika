package harmonikOrt;

public class Main {

	public static void main(String[] args) {
		int[] arr = {2,3,4,5};
		double harmonik=0;
		
		for(int x=0;x<arr.length;x++) {
			harmonik += 1/arr[x];
			
		}
		
		double result = arr.length/harmonik;
		System.out.println(result);
		

	}

}
