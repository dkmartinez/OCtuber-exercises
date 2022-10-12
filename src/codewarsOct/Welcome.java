package codewarsOct;

public class Welcome {
	public static String sayHello(String [] name, String city, String state){
		String otherName = "";
		for(int i = 0; i < name.length; i++) {
			 otherName += " " + name[i];
		}
		
		return "Hello," + otherName + "! Welcome to " + city + ", " + state + "!";
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sayHello(new String[]{"John", "Smith"}, "Phoenix", "Arizona"));
	}

}
