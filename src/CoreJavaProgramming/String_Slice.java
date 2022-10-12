package CoreJavaProgramming;

public class String_Slice {

	public static void main(String[] args) {
		/**
		 * chart at
		 * substring
		 * split
		 */
		
		String str1 = "ABCDEFGHIJ";
		str1.charAt(0); //return the chart of the index sending in this case is the letter A 
		
		//write a program to reverse a string
		
		String word = "Anita lava la tina";
		String reverse = "";
		int counter = word.length();
		for(int i = 0; i < word.length(); i++) {
			counter--;
			reverse+= word.charAt(counter);
		}
		
		System.out.println(reverse);
		
		
		
		str1.substring(2); // the first index its the number where the print start 
		
		System.out.println(str1.substring(2)); //ABCDE <- print CDE because C is in the position 2
		
		System.out.println(str1.substring(2,5)); //ABCDEFGHIJ < - indicate start and end, the last character is -1 so print C to E
		
		String str2 = "AF_B_CED_D";
		String str3 = "_"; //delimiter
		
		//split or cut inside an array when the delimiter is found 
		
		String [] arr = str2.split(str3);
//		
//		for(int i = 0; i < arr.length; i++) {
//			
//			System.out.println(arr[i]);
//		}
		
		for(String x : arr) {
			System.out.println(x);
		}
		
		
		
	}

}
