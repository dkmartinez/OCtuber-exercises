package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedyAndLazyMatch {

	public static void main(String[] args) {
		/**
		 * 
		 *  *- Greedy 	*? - Non Greedy
		 *  +- Greedy 	+? - Non Greedy
		 *  {}- Greedy 	{}? - Non Greedy
		 *  
		 */
		
		String str = "XXdjdjjdjdsYYsssXXiuwuwuwYYjjssXXiiiYY";
		String patt = "XX.*?YY"; //NOn greedy because it not count everything cut in each matches 
		
		Pattern p = Pattern.compile(patt);
		Matcher m = p.matcher(str);
		
//		System.out.println(m.results().count());
		
		m.reset();
		
		while(m.find()) {
			System.out.println("Starts at: " + m.start());
			System.out.println(m.group());
		}
	}

}
