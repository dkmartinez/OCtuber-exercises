package codewarsOct;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vowels {
//	Replace all vowel to exclamation mark in the sentence. aeiouAEIOU is vowel.
	
	public static String replace(final String s) {
		String patt = "[aeiouAEIOU]";
		
		Pattern.compile(patt);
		Pattern p = Pattern.compile(patt);
		Matcher matcher = p.matcher(s);
		if(matcher.find()) {
			p.toString();
		}
        return s; 
    }


	public static void main(String[] args) {
		
		System.out.println(replace("Hola"));

	}

}
