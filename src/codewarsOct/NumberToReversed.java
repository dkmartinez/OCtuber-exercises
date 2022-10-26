package codewarsOct;

		//Given a random non-negative number, you have to return 
		//the digits of this number within an array in reverse order.

public class NumberToReversed {
	public static int[] digitize(long n) {
		String reverse = Long.toString(n);
		int str = 0;
		char [] args = new char[reverse.length()];
		int [] rev = new int[reverse.length()];
		int counter = reverse.length();
		
		for(int i = 0; i < reverse.length(); i++) {
			counter --;
			str = reverse.charAt(counter);
			args[i] = (char)str;
		}
	
		return rev;
		
	  }
	

	public static void main(String[] args) {
		System.out.println(digitize(2344));
		

	}

}
