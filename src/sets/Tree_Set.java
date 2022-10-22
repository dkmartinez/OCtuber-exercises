package sets;

import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {

	public static void main(String[] args) {
		/**
		 * TreeSet is an important implementation of the SortedSet interface
		 * Elements are sorted in ascending order by default
		 * No positional access of elements
		 * Basic Methods: add, remove, clear, contains, size
		 * IMP: Union and Intersection of Sets
		 * IMP: Convert set to list
		 */
		
		Set<String> set1 = new TreeSet<String>();
		
		set1.add("Carlos");
		set1.add("Ana");
		set1.add("Jose");
		set1.add("Anita");
		set1.add("Juan");
		
		System.out.println(set1); //Automatically print the values in ascending order
		
	
		

	}

}
