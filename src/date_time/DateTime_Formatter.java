package date_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTime_Formatter {

	public static void main(String[] args) {
		/*
		 * yyyy - YEAR
		 * yy - YEAR
		 * MM - Month
		 * MMM - Month //is with letters e.g. Dec, Jan, Feb etc...
		 * dd - Day
		 */
		
		String str1 = "12-01-2015"; //when try to parse in this way an  exception is throws because the only formatted valid is yyyy-month-day
		//to use correctly that need a Formatter class to doing correctly to accept the string 
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[MM-dd-yyyy][MMM-dd-yyyy]"); // in the same position that the string
		LocalDate d1 = LocalDate.parse(str1,formatter);
		
		System.out.println(d1);
		
		

	}

}
