package codewarsOct;

public class GrassHopper {

	 public static int findAverage(int[] nums) {
		 if(nums.length == 0) {
			 return 0;
		 }
		 
		 if(nums.length == 1) {
			 return nums[0];
		 }
		 
		 int sum = 0;
		 
		 for(int i = 0; i < nums.length; i++) {
			 sum += nums[i];
		 }
		 int average = sum / nums.length;
	      
	      	System.out.println(average);

	        return average;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findAverage(new int[]{}));

	}

}
