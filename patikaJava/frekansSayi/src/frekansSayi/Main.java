package frekansSayi;

public class Main {
	
	public static boolean find(int[] arr,int value) {
		
		for(int i:arr) {
			if(i==value) {
				return true;
			}
		}
		
		return false;
		
	}
	
	

	public static void main(String[] args) {
		int[] arr = {10, 20, 20, 10, 10, 20, 5, 20,10};
		int[] dublicate = new int[arr.length];
		int start=0;
		
		int count=1;
		for(int i=0;i<arr.length;i++) {
			
			if(find(dublicate,arr[i])) {
			continue;
			
			}
			
			for(int j=i+1;j<arr.length;j++) {
				
			
				if(arr[i]==arr[j]) {
					dublicate[start++]=arr[i];
					count++;
				}
				
			}
				
			if(count>=1) {
			System.out.println(arr[i]+"sayisi "+count+" kere tekrar edildi");
			}
			count=1;
		}
		
		


	}

}
