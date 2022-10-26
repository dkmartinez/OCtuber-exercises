package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		 
		people.add(new Person("Warren Buffett", 100));
		people.add(new Person("Jeff Bezos", 150));
		people.add(new Person("Bill Gates", 100));
		people.add(new Person("Mark Zuck", 50));
		
		
	//This is the actual way 
//	List<Person> hundredClub = new ArrayList<>();
			
//		
//				for(Person x : people) {
//					if(x.billions >= 100) {
//						hundredClub.add(x);
//					}
//				}
//				
//				hundredClub.forEach(person -> System.out.println(person.name));
		
		
		// but Using stream  is more shorter 
		
	List<Person> hundredClub = people.stream()
		 .filter(person -> person.billions >= 100)
		 .collect(Collectors.toList());
	
	hundredClub.forEach(person -> System.out.println(person.name));
	
	}
	

	 static class Person{
		String name;
		int billions;
		
		public Person(String name, int billions) {
			this.name = name;
			this.billions = billions;
			
		}
		
		
	}

}
