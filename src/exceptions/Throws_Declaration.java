package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws_Declaration {

	public static void main(String[] args) throws FileNotFoundException {
	
	abc();
	

	}

	
	public static void abc() throws FileNotFoundException {
		FileInputStream x = new FileInputStream("downloads/abc.txt");
	}
}
