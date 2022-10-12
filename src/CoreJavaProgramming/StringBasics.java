package CoreJavaProgramming;

public class StringBasics {

	public static void main(String[] args) {
		/**
		 * Concatenate
		 * Length
		 * Trim
		 * UpperCase
		 * LowerCase
		 * Empty
		 * 
		 */
		
		String str = "  Hola      ";
		String str2 = " Someone               ";
		
		String str3 = str + str2;
		String str4 = str.concat(str2);
		System.out.println(str4);
		System.out.println(str4.length());
		str4.trim(); //remove unnecessary spaces at the beginning and in the end
		System.out.println(str4.trim());
		
		str4.isEmpty(); // bolean is empty or not || true or false
			

	}

}
