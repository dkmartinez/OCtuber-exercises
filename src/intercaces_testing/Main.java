package intercaces_testing;

public class Main {

	public static void main(String[] args) {
		Dog perrito = new Dog();
		//perrito.print();
		
		printThing(perrito);

	}
	
	static void printThing(Printable thing) {
		thing.print();
	}

}
