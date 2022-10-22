package codewarsOct;

import java.util.ArrayList;
import java.util.List;

public  class ListFiltering {
	 public static List<Object> filterList(final List<Object> list) {
		 List<Object> x = new ArrayList<Object>();
		 for(Object z : list) {
			 if (z instanceof Integer){
				 x.add(z);
			 }
		 }

		    return x;
		  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> list = new ArrayList<Object>();
		list.add(1);
		list.add(2);
		list.add("a");
		list.add("B");
		list.add(3);
		list.add("z");
		list.add(5);
		
		System.out.println(filterList(list));
	}

}
