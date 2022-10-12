package codewarsOct;

public class Converter {
	 public static int binToDecimal(String inp){
		int decimal = Integer.parseInt(inp, 2);
		return decimal;

		  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(binToDecimal("1001001"));

	}

}
