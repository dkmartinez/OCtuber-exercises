package lists;

import java.util.ArrayList;
import java.util.List;

public class Array_List {
	
	public static void main(String [] args) {
		/**
		 * 
		 * ArrayList implements List Interface
		 * ArrayList supports creation of dynamic arrays
		 * 1. Accessing Elements - Add, Get, Update, Remove, Clear
		 * 2. Searching Elements - Index of, Contains,
		 * 3. Viewing portion of list - Sublist
		 * 4. Iterating over list
		 * 5. Size, toArray, isEmpty
		 */
		
		
		ArrayList <String> arr = new ArrayList<String>();
//		List<String> arr1 = new ArrayList<String>(); //list is the parent of arraylist
		
		arr.add("Red"); //add elements to the arrayList
		arr.add("Pink");
		arr.add("Blue");
		arr.add("Green");
		arr.add("Pink");
		arr.add("Grey");
		arr.add("Brown");
		arr.add("Pink");
		arr.add("Purple");
		
		System.out.println(arr.get(3)); //print the value according to the index/position
		
		arr.set(3, "Yellow"); //update the element , the first is the index the second value is the new value
		//list can have duplicates values elements a SET cannot have
//		
//		arr.clear(); //delete all the items in the list
//		arr.remove(0); // delete the element in the index indicated
//		arr.remove("Green"); // also can remove the elements by name
//		
		System.out.println(arr); //print all the  values of the arrayList
		 
		System.out.println(arr.indexOf("Pink")); //return the number of index in the element (first match)
		arr.lastIndexOf("Pink");// return the last  number of index 
		
		arr.contains("Yellow"); // boolean return if true or false 
		arr.size(); //return the number of items in the list
		arr.isEmpty(); //boolean for check if the list is empty or not
		
		arr.subList(2, 5); // the first element is include the last one is -1 index
		System.out.println();
		
		//iterate the arrayList
		for(String x : arr) {
			System.out.println(x);
		}
	}

}
