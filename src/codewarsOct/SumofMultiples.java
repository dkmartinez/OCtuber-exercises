package codewarsOct;

public class SumofMultiples  {
	
	public static long sumMul (int n, int m) {
		if(m < 0) {
			throw new IllegalArgumentException("Invalid Value");
		}
		
		int sum = 0;
        for(int i = n; i < m; i++) {
        	if(i % n == 0) {
        		sum += i;
        	}
        }
		
        return sum;
    }

	public static void main(String[] args) {
		
		System.out.println(sumMul(5,-20));
	}

}
