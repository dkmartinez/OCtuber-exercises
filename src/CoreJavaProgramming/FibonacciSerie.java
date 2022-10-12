package CoreJavaProgramming;

public class FibonacciSerie {

	public static void main(String[] args) {
		
		/*
		 * 
		 * Write a program to find first 20 numbers of Fibonacci Series
		 * 
		 * */
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		System.out.print(num1 + " " + num2);
		for(int i =1; i <= 18; i++) {
			num3 = num1 + num2;
			System.out.print(" " + num3);
			num1 = num2;
			num2 = num3;
		}
		

	}

}
