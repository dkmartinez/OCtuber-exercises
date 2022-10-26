package codewarsOct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateEncoder {

		public static int sum(List<?> mixed) {
			
			int count = 0;
			
			int [] myList = new int[mixed.size()];
			

			for(Integer x: myList) {
				count += x;
			}
			return count;
	
		}
		
		

	public static void main(String[] args) {
		
		System.out.println(sum(Arrays.asList(9, 3, "7", "3")));
		
//		String patt = "[A-Za-z0-9 ]";
//		String word = "Prespe cialized";
//		
//		
//		
//		System.out.println(word.replaceAll(patt, "("));
//	

	}

}
