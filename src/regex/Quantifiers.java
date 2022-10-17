package regex;

public class Quantifiers {

	public static void main(String[] args) {
		/**
		 *  * - Matches 0 or more instances of preceding character
		 *  + - Matches 1 or more instances of preceding character
		 *  ? - Matches 0 or 1 instances of preceding character
		 *  {n} - Matches exactly 'n' number instances of preceding character
		 *  {n,m} - Matches 'n' or maximum 'm' instances of preceding character
		 *  {n, } - Matches minimum 'n' or more instances of preceding character 
		 */
		
		
//		String patt = "abc*"; // need to have 0 or more coincidences counting 0 with the last letter
//		String patt ="abc+" ; //one ore more coincidences
		
//		String patt = "abc?"; //only need to be once or zero 
		
//		String patt = "ab(xyz)+"; // the block (xyz) needs to appear once y the string
//		String patt = "ab(xyz)?";
		
//		String patt = "ab(xyz){3}"; // the block () need to repeat the number specific of times {}
//		String patt = "ab(xyz){3, 8}"; //minimum and maximum
		String patt = "ab(xyz){3,}"; //when don't have the maximum numbers of repition
		
		String letter = "ab";
		System.out.println(letter.matches(patt));
		
		

	}

}
