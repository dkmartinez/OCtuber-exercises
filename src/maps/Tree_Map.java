package maps;

import java.util.TreeMap;

public class Tree_Map {

	public static void main(String[] args) {
		/**
		 * TreeMap is implemented based on red-black tree structure
		 * It is sorted by keys
		 * Methods: put, get, containsKey, containsValue, replace, remove, clear, keySet, values, entrySet
		 * firstEntry, lastEntry, firstKey, lastKey, pollFirstEntry, pollLastEntry
		 */
		
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
		
		map.put('d', 1000);
		map.put('a', 2000);
		map.put('z', 3000);
		map.put('c', 3000);
		
		System.out.println(map); //sorted using key
		
		System.out.println(map.containsValue(5000)); //boolean 
		map.put('a', 4000); //also can replace as replace method 
		
		map.firstEntry(); //first entry by order by value
		map.lastEntry(); //last entry by order by value
		map.firstKey();
		map.lastKey(); 
		
		map.pollFirstEntry(); // remove the first entry
		map.pollLastEntry(); // remove the last entry

	}

}
