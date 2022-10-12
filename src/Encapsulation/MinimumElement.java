package Encapsulation;

import java.util.Scanner;

public class MinimumElement {
	
	private static int readInteger() {
		Scanner scanner = new Scanner(System.in);
		int numberToReturn = scanner.nextInt();
		
		return numberToReturn;
	}
	
	
	private static int[] readElements(int n) {
		
		int [] arr = new int[n];
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			int nums = scanner.nextInt();
			arr[i] = nums;
			
		}
		
		return arr;
		
	}
	
	
	private static int findMin(int [] numbers) {
		
		int minimum = Integer.MAX_VALUE;
		
		for(int i = 0; i < numbers.length; i++) {
			if(minimum > numbers[i]) {
				minimum = numbers[i];

			}
		}
		return minimum;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findMin(readElements(readInteger()));
		
	}

}
