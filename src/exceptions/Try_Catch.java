package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Try_Catch {

	public static void main(String[] args) {
		abc();

	}
	
	
public static void abc() {
	try {
		FileInputStream x = new FileInputStream("dowloands/abc.txt");
	} catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
		System.out.println(e.toString() + " tostring");
		e.printStackTrace();
	}
	
	}
}
