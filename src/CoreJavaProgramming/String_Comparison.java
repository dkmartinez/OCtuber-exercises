package CoreJavaProgramming;

public class String_Comparison {

	public static void main(String[] args) {
		/**
		 * Equals
		 * Compare to
		 * Matches
		 * 
		 */
		
		String str1 = "ABCD";
		String str2 = "ABcD";
		
		str1.equals(str2); //false if not true (not equals) is case sensitive
		str1.equalsIgnoreCase(str2); // ignores upper o lower case;
		
		str1.compareTo(str2); // return an int with the unicode value if is false if its equal return 0
		
		String patt = "[A-Z]{1,}"; // regex expresion 
		str1.matches(patt); // return true if contain the regex(regular expresion) exprexion
		System.out.println(str1.matches(patt));

	}

}
