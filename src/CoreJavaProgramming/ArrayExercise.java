package CoreJavaProgramming;

public class ArrayExercise {

	public static void main(String[] args) {
		/**
		 * Write a program to reverse the contents of an array
		 */
		
		int [] arr = {10,20,30,40,50,60};
		
		int [] reverse = new int [arr.length];
		int counter = arr.length;
		
		for(int i = 0; i < arr.length; i++) {
			--counter;
			reverse[i] = arr[counter];
		}
		
		for(int a : reverse) {
			System.out.println(a);
		}

	}

}
