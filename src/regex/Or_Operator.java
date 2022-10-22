package regex;

public class Or_Operator {

	public static void main(String[] args) {
		/**
		 * OR-Operator [|]
		 */
		
		String patt = "[a(b|c|d|xsd]"; //could be ab or ac or ad or a group etc. 
		String str = "axsd"; //true because the group xsd is in the conditions

	}

}
