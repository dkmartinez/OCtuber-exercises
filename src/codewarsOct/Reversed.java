package codewarsOct;

public class Reversed {
	
	public static int[] reverse(int n){
	    
		int [] arr = new int[n];
		int counter = n;
		
		for(int i = 0; i < n; i++) {
			
			arr[i] = counter--;
			
		}
		
		return arr;
	  
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse(8);
	}

}
