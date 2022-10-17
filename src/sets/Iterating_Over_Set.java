package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Iterating_Over_Set {

	public static void main(String[] args) {
		/*
		 * Special For Loop
		 * Iterator
		 */
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		
		set1.add(100);
		set1.add(200);
		set1.add(300);
		set1.add(400);
		
		for(Integer x : set1) {
			System.out.println(x); //not order collection 
		}
		
		Set<String> set2 = new TreeSet<String>();
		set2.add("Juan");
		set2.add("Maria");
		set2.add("Lupita");
		set2.add("Jose");
		set2.add("Juan");
		
		Iterator it1 = set2.iterator();
		
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}

	}

}
