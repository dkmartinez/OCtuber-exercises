package codewarsOct;

public class Test {
	 public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
		 int x = 1;
		 int y = 1;
		 
		
		for(int i = 0; i < firstCuboid.length; i++) {
			x *= firstCuboid[i];
		}
		for(int j = 0; j < secondCuboid.length; j++) {
			y *= secondCuboid[j];
		}

		return x -y;
		  }
	 
	 public static int summation(int n) {
		 int sum = 0;
		 for(int i = 1; i <= n; i++) {
			 sum += i;
		 }
			 return sum;
	    }
	 
	
	 public static int[] pipeFix(int[] numbers) {
		   if(numbers.length == 0) {
			   return null;
		   }
		   int size = numbers[numbers.length-1];
		  
		   int [] sec = new int[numbers[numbers.length-1]];
		   
		   int counter = numbers[0];
		
		   for(int i = 0; i < size; i++) {
			  
			   sec[i] = counter++;
			
			   if(counter > numbers[numbers.length-1]) {
				   break;
			   }
			  
		   }
		  
		   return sec;
		 
		  }
	 
	 
	 
	 
	 public static String abbrevName(String name) {
		    
		 String [] eachName = name.split(" ");
		 
		 for(String x : eachName) {
			 x.charAt(0);
		 }
		 
		 
		 return name;
		  }
	 
	 public static double sum(double[] numbers) {
		 if(numbers.length < 0) {
			 return 0;
		 }
		 double res = 0.0;
		    for(double x : numbers){
		    	res += x;		    	
		    }
		    return res;
		  }
	 
	 
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(findDifference(new int[]{3, 2, 5}, new int[]{1, 4, 4}));
//		abbrevName("Sam Harris Juan");
		
		
//		System.out.println(sum(new double[] {}));
		
		double first = 1083.86 * 0.05;
		double second =  first * 0.18;
		double third = 1083.86 + first - second;
		
		
		System.out.println(third);
	}

}
