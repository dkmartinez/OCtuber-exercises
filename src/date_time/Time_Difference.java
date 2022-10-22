package date_time;

import java.time.Duration;
import java.time.LocalTime;

public class Time_Difference {

	public static void main(String[] args) {
		
		LocalTime t1 = LocalTime.of(10, 57);
		Duration d1 = Duration.between(t1, LocalTime.now());
		
		System.out.println(d1.toHours());
		System.out.println(d1.toMinutes());
		

	}

}
