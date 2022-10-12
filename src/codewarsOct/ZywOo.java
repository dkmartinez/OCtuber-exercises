package codewarsOct;

public class ZywOo {
	
	public static int[] take(int[] arr, int n) {
		if(arr.length == 0){
		      return new int[] {};
		    }
		
		if(n > arr.length) {
			n = arr.length;
		}
		int [] nums = new int[n];
		
		for(int i = 0; i < n; i++) {
				nums[i] = arr[i];
				
		}
		
	    return nums;
	  }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		take(new int[]{-54, 16, -25, 29, 31, -2, 54, -69, 34, 3, 61, -44, 81, 44, 77, 49, 23, 60, 52, 20, -50, 31, -7, -19, 74, 43, 60, -68, 47, -32, -65, -64, 1, 71, 21, -56, 21}, 77);
	}

}
