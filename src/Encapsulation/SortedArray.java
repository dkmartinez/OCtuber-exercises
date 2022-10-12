package Encapsulation;

import java.util.Scanner;

public class SortedArray {
	
	public static int [] getIntegers(int size) {
		
		Scanner scanner = new Scanner(System.in);
		int [] values = new int [size];
		for(int i = 0; i < size; i++) {
			values[i] = scanner.nextInt();
		}
		
		return values;
	}
	
	
	public static void main(String[] args) {
		
		getIntegers(5);

	}

}
