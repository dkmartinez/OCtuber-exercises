package CoreJavaProgramming;

public class String_Conversion {

	public static void main(String[] args) {
		/**
		 * toString
		 * toBinaryString
		 * toHexString
		 * toOctalString
		 * parseInt
		 */
		
		int num1 = 100;
		
		//numerics into String
		String str1 = Integer.toString(num1); //convert int to string
		String str2 = Integer.toBinaryString(num1);
		String str3 = Integer.toHexString(num1);
		String str4 = Integer.toOctalString(num1);
		
		
		//normal string to integer
		Integer.parseInt(str1);
		Integer.parseInt(str2,2); // to convert a string into a binary
		Integer.parseInt(str3, 16);
		Integer.parseInt(str4, 8);
		
		
		
		
		

	}

}
