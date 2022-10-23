package codewarsOct;

public class MostDigits {

	public static int findLongest(int[] numbers) {
		
		String [] num = new String[numbers.length];
		int counter = 0;
		int value = 0;
		
		
		for(int i = 0; i < numbers.length; i++) {
			
			
			num[i] = Integer.toString(numbers[i]);
			num[i] = num[i].replace("-", "");
			
			if(num[i].length() > counter) {
			
				counter = num[i].length();
				value = numbers[i];
			}
		}
		
		return value;
		  
	  }
	
	public static void main(String[] args) {
		// If two numbers in the argument array have the same number of digits, return the first one in the array.
		System.out.println(findLongest(new int[] {2073600039, -1379849422}));


	}

}
