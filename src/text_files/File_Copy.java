package text_files;

import java.io.*;

import org.apache.commons.io.FileUtils;

public class File_Copy {
	
	public static void main(String[] args) throws IOException {
		/*
		 * 1.Copy contents of one file to another
		 * 2. Copy a file to directory
		 * 3. Rename / Move a file
		 */
		
		File file = new File("C:\\Users\\diana\\Desktop\\edits\\File1.txt");
		File file2 = new File("C:\\Users\\diana\\Desktop\\edits\\File2.txt");
		File dir = new File("C:\\Users\\diana\\Desktop\\edits\\Dir1");
		File file3 = new File("C:\\Users\\diana\\Desktop\\edits\\File3.txt");
		
		FileUtils.copyFile(file, file2); //copy one file to other
		FileUtils.copyFileToDirectory(file, dir);  //copy the document to a directory
		FileUtils.moveFile(file2, file3); //provide a new name
		
		
	}

}
