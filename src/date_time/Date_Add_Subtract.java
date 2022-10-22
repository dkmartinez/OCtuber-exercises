package date_time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Date_Add_Subtract {

	public static void main(String[] args) {
		/*
		 * 1. Plus / Minus Methods
		 * 2. ChronoUnit
		 * 
		 */
		
		//add three months to the currently month
		LocalDate d1 = LocalDate.now().plusMonths(3);
		
		//subtract  three months to the currently month
		LocalDate d2 = LocalDate.now().minusMonths(3);
		
		LocalDate d3 = LocalDate.now().minus(10, ChronoUnit.DECADES); // subtract 10 decades to the currently date
		
		System.out.println(d1);
		System.out.println(d3);

	}

}
