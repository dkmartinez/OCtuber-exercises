package codewarsOct;

public class CodeChallenge {
	
	
	public static int strCount(String str, char letter) {
	
		int counter = 0;
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == letter) {
				counter++;
			}
		}	
		return counter;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strCount("Hello", 'l'));
		
	}

}
