package regex;

public class Character_Classes {

	public static void main(String[] args) {
		/**
		 * 1. \d - matches a single digit character
		 * 2. \w - matches a single word character
		 * 3. \s -matches a single whitespace character
		 * 4. \D - matches a single non-digit character
		 * 5. \W - matches a single non-digit and non-word character
		 */
//		
//		String patt = "\\d"; // the first \ represent an escape character // only single digit
//		String patt2 = "\\d{3}"; // specific number of times that a number can appear 
//		String str = "5221";
//		
//		System.out.println(str.matches(patt2));
//		
//		String patt = "\\w{5}"; 
//		String str = "hello";
//		System.out.println(str.matches(patt));
		
		String patt = "\\D{3,5}"; //non digit character true 
		String patt2 = "\\W{1,5}"; //non digit character or non letters (words) true 
		

	}

}
