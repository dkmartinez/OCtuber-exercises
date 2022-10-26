package Generics;

public class MyClass <T, G, S>{
	T ob;
	G obj2;
	S obj3;
	
	MyClass(T ob, G obj2, S obj3){
		this.ob = ob;
		this.obj2 = obj2;
		this.obj3 = obj3;
	}
	
	void chackStatus() {
		System.out.println(ob.getClass().getName());
	}
}
