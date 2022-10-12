package CoreJavaProgramming;

public class ArrayOfObject {

	public static void main(String[] args) {
		/** 
		 * Can contain different type of data
		 * 
		 */
		
//		Object [] arr = {1,2,3, "Hello"};
//		
//		Object [][] arr2 = {{"mayur", 33, 55.1},{"juan", 25, 33.0}}; 
		
		int [][] m = new int[5][10];
		
		for(int i = 2; i <= 6; i++) {
			for(int j = 1; j <= 10; j++) {
				m[i-2][j-1] = i*j;
			}
		}
		
		for(int [] x : m) {
			for(int j : x) {
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}

	}

}
