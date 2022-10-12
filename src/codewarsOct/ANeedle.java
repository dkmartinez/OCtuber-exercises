package codewarsOct;

public class ANeedle {
	
	 public static String findNeedle(Object[] haystack) {
		    int counter = 0;
		 for(int i = 0; i < haystack.length; i++) {
			 
			 if(haystack[i] == "needle") {
				 return "found the needle at position " + counter;
			 }
			 counter++;
		 }
		 
		 
		 return "Not found";
		 
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(findNeedle(new Object[] { "3", "123124234", null,  "needle", "world", "hay", 2, "3", true, false}));
	}

}
