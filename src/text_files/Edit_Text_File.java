package text_files;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Edit_Text_File {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\diana\\Desktop\\index.txt");
		
		try {
			FileUtils.write(file, "Learning is Growing", "UTF-8", true); // the last parameter is append is true is for edit false to delete all the content and only put your new message
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
