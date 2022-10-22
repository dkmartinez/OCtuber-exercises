package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_Example_02 {

	public static void main(String[] args) {
		/**
		 * 
		 * Create  a RegEx pattern to extract all prices from a String
		 * e.g. "Your total cost is $24.99 after $0.99 sale discount and $12.09 coupon1 discount and $0.00 coupon2 discount"
		 * RegEx pattern should be able to match all prices from the above string 
		 */
		
		String str1 = "Your total cost is $24.99 after $0.99 sale discount and $12.09 coupon1 discount and $0.00 coupon2 discount";
//		String patt ="[$.*?[^A-Za-z ]]";
		
//		Pattern p = Pattern.compile(patt);
//		Matcher m = p.matcher(str1);
//		
//		while(m.find()) {
//			//System.out.println("Starts at: " + m.start());
//			System.out.print(m.group());
//		}
		
		String patt = "\\${1}\\d{1,}\\.\\d{1,}";
		
		Pattern p = Pattern.compile(patt);
		Matcher m = p.matcher(str1);
		
		while(m.find()) {
			System.out.println(m.group());
		}
		

	}

}
