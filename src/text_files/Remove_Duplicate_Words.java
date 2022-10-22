package text_files;
import java.io.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Remove_Duplicate_Words {

	public static void main(String[] args) throws IOException {
		/*
		 * Remove all duplicate words from a text file
		 */
		
		File file = new File("C:\\Users\\diana\\Desktop\\edits\\File3.txt");
		
		String str1 = FileUtils.readFileToString(file, "UTF-8");
		
		str1 = str1.replaceAll("\n", " ");
		
		String [] arr = str1.split(" ");
		String str2 = "";
		
		for(String x : arr) {
			if(!str2.contains(x) && x.trim()!="" ) {
				str2 = str2 + " " + x;
			}
		}
		FileUtils.write(file, str2, "UTF-8", false);
	
		}
	}

