package codewarsOct;

public class ReverseLetter {
	
	//Given a string str, reverse it and omit all non-alphabetic characters.
	 public static String reverseLetter(final String str) {
			String patt = "[^A-Za-z]";
			String x = str.replaceAll(patt, "");
			String y = "";
			
			for(int i = 0; i< x.length(); i++) {
				y = x.charAt(i) + y;
			}
			
	        return y; 
	    }

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseLetter("ab23c"));
		
	}

}
