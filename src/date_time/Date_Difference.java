package date_time;

import java.time.LocalDate;
import java.time.Period;

public class Date_Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub}
		
		LocalDate d1 = LocalDate.of(1990, 12, 21);
		Period p = Period.between(d1, LocalDate.now());
		
		System.out.println(" The difference " + d1 + " vs " + LocalDate.now() + " is Years: " + p.getYears() + " Months: " + p.getMonths() + " Days: " + p.getDays());
		

	}

}
