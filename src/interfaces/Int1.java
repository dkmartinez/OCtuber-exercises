package interfaces;

public interface Int1 {
	//variables are allowed only if are static and final, the final variable need to have a value
	//the static final are by default you can omitted 
	
	static final int abc = 0;
	//everything in an interface is public as default 
	
	//by default all the methods are public and abstract
	void doTHis();
	
	
	//can contain static methods
	//static methods cannot be override 
	static void xyz() {
		System.out.println("Static xyz from Int1");
	}
	
	//can contain default methods, only can used in java 8 and onwards
	//they are allowed to users to provide some functionality details in the interfaces
	//default methods can be override 
	default void uws() {
		System.out.println();
	}
}
