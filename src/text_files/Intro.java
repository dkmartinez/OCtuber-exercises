package text_files;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Intro {

	public static void main(String[] args) {
		/*
		 * Working with text files using Apache Commons IO
		 * 1.Download Apache Commons IO. 
		 * 2. Add Commons IO jar files to Java Build Path.
		 * 3. Use FileUtils from commons-io to read a text file. 
		 */
		
		System.out.println();
		
		
		File file = new File("C:\\Users\\diana\\Desktop\\index.txt");
	
		try {
			String x = FileUtils.readFileToString(file, "UTF-8");
			System.out.println(x);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Not found");
		}
		
		

	}

}
