package regex;

public class Bracket_Expressions {

	public static void main(String[] args) {
		/*
		 * 1. Adding literals in brackets [aeiou]
		 * 2. Adding ranges in brackets [A-Z0-9]
		 * 3. Usage of ^ in brackets [^a-z]
		 */
		
		
		String patt = "[cbs]at"; // only one letter of the brackets needs to coincide ej: cat 
		String patt2 = "[A-Z]at"; // each letter in uppercase can be accept  
		String str1 = "Cat";
		String patt3 = "[^a-z]at"; //is true if the letter contains other thing that will not be uppercase for the ^
		System.out.println(str1.matches(patt3)); //true
		
		String patt5 = "[A-Za-z0-9]{2}ta";
		String str2 = "hOta";
		System.out.println(str2.matches(patt5));
		//to specified the times can repeat specify with {3} // ej thee times 
		
	}

}
