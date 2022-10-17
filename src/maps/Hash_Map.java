package maps;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {

	public static void main(String[] args) {
		/** 
		 * HashMap provides the basic implementation of Map interface
		 * It stores data in key and Value pairs
		 * We can access a value using the corresponding key
		 * Methods: put, get, containsKey, remove, clear, keySet, values, entrySet
		 * 
		 */
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(1, "Jan"); //first argument the key the second is the value
		map1.put(2, "Feb");
		map1.put(3, "Mar");
		map1.put(4, "Apr");
		map1.put(5, "May");
		
		System.out.println(map1); //print the key ant the value
		
		System.out.println(map1.get(5)); //search by the key, print the value, if the key don't exist return a null value
		
		System.out.println(map1.containsKey(2)); //return a boolean true/false 
//		
		map1.put(4, "Dec");  // update the value
//		map1.remove(4); // delete by a key
//		
//		map1.clear(); //delete all the map 
		
//		map1.remove(5, "May");
		
		map1.keySet(); //return only the keys of the hashMap
		
		map1.values(); //return only the values of the hashMap
		
		map1.entrySet(); //return all the entries (key and value)
		
		
		
		
		

	}

}
