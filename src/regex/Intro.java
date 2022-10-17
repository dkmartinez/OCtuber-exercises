package regex;

public class Intro {

	public static void main(String[] args) {
		/**
		 * What is regular expressions? 
		 * A regular expression (regex) defines a search pattern for strings
		 * The pattern can be a simple character, a fixed string or a
		 * complex expression containing special characters, numbers, etc. 
		 * 
		 */
		
		 String str = "$000_#532#_23";
		 String patt = "[^A-Za-z-0-9]";
		 
		 String newstr = str.replaceAll(patt, "");
		 System.out.println(newstr);
		 
		
		

	}

}
