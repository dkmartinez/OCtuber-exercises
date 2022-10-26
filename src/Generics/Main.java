package Generics;

public class Main {

	public static void main(String[] args) {
		
		MyClass<String, Integer, Double> obj = new MyClass<>("Hola from here", 15, 14.05);
		
		obj.chackStatus();
	

	}

}
