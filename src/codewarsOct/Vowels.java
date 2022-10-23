package codewarsOct;

public class Vowels {
//	Replace all vowel to exclamation mark in the sentence. aeiouAEIOU is vowel.
	
	public static String replace(final String s) {
		
		
        return s.replaceAll("[aeiouAEIOU]", "!"); 
    }


	public static void main(String[] args) {
		
		System.out.println(replace("HolaaaOIs"));

	}

}
