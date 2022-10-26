package codewarsOct;
//We want to generate a function that computes the series starting from 0 and ending until the given number.

public class SumOfNumbers {
	 public static String showSequence(int value){
		 if(value == 0) {
			 return "0=0";
		 }
		   if(value < 0){
		     return value + "<0";
		      }
		    Integer sum = 0;
		    String str = "";
		    for(int i = 0; i <= value; i++){
		    	if(i < value) {
		    		str += i + "+";
		    	}
		    	if(value == i) {
		    		str += i;
		    	}
		      sum += i;
		    }  
		    return str + " = " + sum.toString();
		  }
	public static void main(String[] args) {
		System.out.println(showSequence(6));
		

	}

}
