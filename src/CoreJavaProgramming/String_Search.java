package CoreJavaProgramming;

public class String_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Contains
		 * Starts with
		 * Ends With
		 * Index of
		 * Last Index of
		 * 
		 */
		
		String str1 = "I   love  and more love Java";
		String str2 = "Java";
		
		
		str1.contains(str2); // boolean answer  is case sensitive 
		str1.startsWith("I");
		str1.endsWith("a");
		
		
		str1.indexOf("love");  // return the number of index of the letter, only the first occurrence
		str1.indexOf("love", 7); // if you need all the occurrences it can be specified the index that need to start to found
		str1.lastIndexOf("love"); // or it can be used the last index;
		
		
		System.out.println(str1.indexOf("a"));

	}

}
