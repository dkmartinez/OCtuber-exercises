package regex;

public class Number_Range {

	public static void main(String[] args) {
		/**
		 * Create a RegEx pattern to represent following number ranges
		 * 1. 0-99
		 * 2. 0 -1000
		 * 3. 99-9999
		 * 4. 25-75
		 * 5. 220 -240
		 * 
		 */
		
		//d[2-6] //any digit from 2 to six 
		
		//any number from 0 to 99
		String patt = "[0-9][0-9]?"; //the second digit could or not can be there // the meaning of (?)
		String str = "225";
		
		//number 0 -1000
		String patt2 = "[0-9][0-9]?[0-9]?[0]?"; // || "[0-9][0-9]?[0-9]?|1000"
		
		//number 99-9999
		String patt3 = "99|[1-9][0-9][0-9][0-9]?";
		
		//number 25-75 
		String patt4 = "[2-7][0-5]"; // || "2[5-9]|[3-6][0-9]|7[0-5]"
		
		//220-240 
		String patt5 = "2[2-3][0-9]|240";
		System.out.println(str.matches(patt5));
		
	
		

	}

}
