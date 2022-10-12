package codewarsOct;

public class Correct {
	
	 public static String correct(String string) {
		 	String zero = string.replaceAll("0", "O");
		 	String first = zero.replaceAll("1", "I");
		 	String five = first.replaceAll("5", "S");
	
		    return five;
		  }
	 
	
	  
	  public static int sumOfAngles(int n) {
		   if(n >= 2){
		     return (n*90);
		   }
		     return n;
		   }


	public static void main(String[] args) {
		System.out.println(correct("J. R. R. T0LK1EN - THE L0RD 0F THE R1NG5"));
		System.out.println(sumOfAngles(2));
	}

}
