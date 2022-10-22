package exceptions;

public class Finally_Block {

	public static void main(String[] args) {
		/*
		 * The finally block gets executed after successful run of the
		 * try block or after one of the catch blocks handled an exception 
		 */
		
		try {
			System.out.println(100/10);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Finally Block of code");
		}

	}

}
