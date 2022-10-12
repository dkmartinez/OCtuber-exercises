package CoreJavaProgramming;

public class String_Replace {

	public static void main(String[] args) {
		/**
		 * Replace - Normal
		 * Replace All - RegEx
		 */
		
		
		String str1 = "Someth123ng Fo123r Practi123ce";
		String str2 = "123";
		String str3 =  "A";
		
		System.out.println(str1.replace(str2, str3)); //replace the word found in str2(123) by str3 ("A)
		
		//for found special character use regex expresion 
		String str4 = "%EI$%&THER #YOU&*";
		String patt= "[^A-Za-z0-0\\s]";
		
		System.out.println(str4.replaceAll(patt, ""));
		

	}

}
