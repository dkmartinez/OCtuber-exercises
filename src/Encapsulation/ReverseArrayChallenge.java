package Encapsulation;

import java.util.Arrays;

public class ReverseArrayChallenge {
	
	private static void reverse(int [] arr) {
		int counter = arr.length;
		int halfLength = arr.length / 2;
		
		for(int i = 0; i < halfLength; i++) {
			int temp = arr[i];
			counter--;
			arr[i] = arr[counter];
			arr[counter] = temp;
		}
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,5,73,23,42};
		
		System.out.println("Array " + Arrays.toString(arr));
		
		reverse(arr);
		
		System.out.println("Reversed array " + Arrays.toString(arr));

	}

}
