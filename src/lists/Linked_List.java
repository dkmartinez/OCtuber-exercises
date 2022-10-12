package lists;

import java.util.LinkedList;
import java.util.List;

public class Linked_List {

	public static void main(String[] args) {
		/**
		 * LinkdList implements List Interface 
		 * LinkedList elements are linked together using pointers
		 * Supported Methods:
		 * 1. Accessing Elements: Add, Get, Update, Remove, Clear
		 * 2. Searching Elements - Index Of, Contains,
		 * 3. Viewing porting of list - Sublist
		 * 4. Iterating over list
		 * 5. Size, toArray, isEmpty
		 * 6. Peek and Poll Methods
		 */
		//for java 10 can use var : var list = new LinkedList<Double>();
		
		LinkedList<Double> list = new LinkedList<Double>(); 
		list.add(20.10);
		list.add(30.10);
		list.add(40.10);
		list.add(20.10);
		list.add(20.10);
		
		
		list.get(2); // search by  index {
		list.set(2, 40.20); //update the element by index and changing the value
		list.clear(); //delete the items 
		list.remove(0); // delete an specific item by index number or by name
		
		list.add(2, 30.20); // add an item in an specific index 
		list.indexOf(20.10); // search the first item , if the item is not in the list return -1
		list.lastIndexOf(20.10); //search the last item
		list.contains(30.10); //true or false
		list.subList(0, 2); //return the values of the indicated index 
		list.peekFirst(); //return the first item
		list.peekLast(); //return the last item 
		list.pollFirst(); //remove the first item
		list.pollLast(); // remove the last item from the list 
		
				
		
		

	}

}
