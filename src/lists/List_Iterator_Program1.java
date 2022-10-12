package lists;
import java.util.ArrayList;
import java.util.ListIterator;
public class List_Iterator_Program1 {

	public static void main(String[] args) {
		// Remove all null values from ArrayList
		ArrayList <Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(null);
		list.add(4);
		list.add(5);
		list.add(null);
		
		ListIterator itr = list.listIterator();
	
		while(itr.hasNext()) {
			if(itr.next() == null) {
				//itr.remove();
				itr.set(0);
			}
		}
		
		System.out.println(list);
		
		

	}

}
