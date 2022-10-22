package date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Custom_Date_Time {

	public static void main(String[] args) {
		//Create local date 
		LocalDate d1 = LocalDate.of(2022, 12, 24);
		LocalTime t1 = LocalTime.of(10, 30);
		LocalDateTime dt1 = LocalDateTime.of(d1, t1);
		
		System.out.println(dt1);

	}

}
