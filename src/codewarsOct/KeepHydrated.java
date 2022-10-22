package codewarsOct;

public class KeepHydrated {
	
	public static int Liters(double time)  {
	    double needIt = time * 0.5;
	    int result = (int)Math.floor(needIt);
	    return result;
	  
	  }

	public static void main(String[] args) {
		// Nathan loves cycling.
		//Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
		//
		//You get given the time in hours and you need to return the number of litres Nathan will drink,
		//rounded to the smallest value.
		
		System.out.println(Liters(6.7));

	}

}
