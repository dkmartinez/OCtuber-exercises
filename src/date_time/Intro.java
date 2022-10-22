package date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Intro {

	public static void main(String[] args) {
		/*
		 * How to get current date?
		 * How to get current time? 
		 * How to get current date and time? 
		 * 
		 */
		
		System.out.println(LocalDate.now()); //use the class LocalDate to get the currently date year-month-day
		System.out.println(LocalTime.now()); //current hour
		System.out.println(LocalDateTime.now()); //hour and date 

	}

}
