package CoreJavaProgramming;

public class Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * What is 2-D array
		 * How to get length of array 2-D
		 * How to add elements to 2-D array
		 * How to retrieve elements from 2D array
		 * How to update elements of 2-D array
		 * How to iterate over 2-D Array using modified 'for loop'
		 * 
		 */
		
		String [] [] arr = {{"A", "B", "C"}, //first row contains three columns
							{"D", "E","F"}, //second row contains three columns
							{"G", "H"},
							{"DA", "EB","FC"}}; //third row contains two columns
		
//		System.out.println(arr.length); //number of row
//		System.out.println(arr[2].length); //number of columns in the [row]
//		
		//How to iterate
		for(String [] x : arr) {
			for(String y : x) {
				System.out.println(y);
			}
			
		}
		
	}

}
