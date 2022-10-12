package CoreJavaProgramming;

import java.util.Scanner;

public class StringBuilderClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 
		 * Some useful methods from StringBuilder
		 * insert,replace,delete,reverse
		 */
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter a String: " );
		String str1 = s1.nextLine();
		String temp = "";
		
		for(int i = 0; i < str1.length(); i++) {
			temp = str1.charAt(i) + temp;
		}
		
		System.out.println("Reverse String: " + temp);
		s1.close();
		
		

	}

}
