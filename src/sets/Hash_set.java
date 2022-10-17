package sets;

import java.util.HashSet;


public class Hash_set {

	public static void main(String[] args) {
		/**
		 * Set is a collection that cannot contain duplicate elements
		 * HashSet does not maintain insertion order
		 * No positional access of elements
		 * Basic Methods: add,remove,clear, contain, size
		 * IMP: Union and Intersection of sets
		 * IMP Convert set to list
		 */
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		
		set1.add(10);
		set1.add(20);
		set1.add(20);
		set1.add(30);
		
		System.out.println(set1);
//		set1.remove(10); //remove element by value because not have an index order
		
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		
		set1.add(50);
		set1.add(60);
		set1.add(70);
		set1.add(90);
		
		set1.addAll(set2); // to have the union of two sets, if contain a value duplicated is omitted 
		set1.retainAll(set2); // only return the duplicate elements (once)
		
		//to convert set a list create a arrayList and use the method addAll(name of the set);
		
	}

}
