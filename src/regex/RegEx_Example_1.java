package regex;

public class RegEx_Example_1 {

	public static void main(String[] args) {
		/**
		 * Create a RegEx pattern to represent following web sites
		 * 
		 * 1. www.dezlearn.com
		 * 2.www.dezlear.us
		 * 3.www.dez.com
		 * 3. www.dez.us 
		 */
		
		String patt = "www\\.(dezlearn|dez)\\.(com|us)"; //the dot means any character so to ignore that need to put the escape slash
		String str1 = "www.dez.us";
		
		System.out.println(str1.matches(patt));
	}

}
