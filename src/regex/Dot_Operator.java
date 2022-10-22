package regex;

public class Dot_Operator {

	public static void main(String[] args) {
		/**
		 * DOT '.' Matches any single character 
		 */
		
		String patt = "ABC."; //before the dot could have any character mays minus etc (only one) 
		String patt2 = "Acs.*"; // can aceppt any character in many times 
		
		String str = "ABC0";
		String str2 = "Acs38374747";
		System.out.println(str.matches(patt));
		System.out.println(str2.matches(patt2));
		
	}

}
