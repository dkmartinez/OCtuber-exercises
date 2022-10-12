package lists;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_Iterator {

	public static void main(String[] args) {
		/**
		 * List Iterator is used when we want to enumerate elements of list
		 * It can be used both on ArrayList and LinkedList
		 * Methods:
		 * next, hasNext, previous, hasPrevious
		 * nextIndex, previousIndex, add, set, remove
		 */
		
		ArrayList <Double> list = new ArrayList<Double>();
		
		list.add(1.2);
		list.add(2.2);
		list.add(3.2);
		list.add(4.2);
		list.add(5.2);
		
		//create a list iterator
		
		ListIterator itr = list.listIterator(); //it can add a index and that index will be the first
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ListIterator itr2 = list.listIterator(list.size()); // return the last element 
		System.out.println("------------");
		while(itr2.hasPrevious()) { // iterate since the last element because itr2 start in the last index
			System.out.println(itr2.previous()); //reverse mode
			
		}
		

	}

}
