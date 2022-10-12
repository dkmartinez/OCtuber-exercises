package codewarsOct;

public class countingSheeps {

	 public static String countingSheep(int num) {
		    //Add your code here
		 	String phase = "";
		 	
		    if(num <= 0){
		      return "";
		    }
		    
		    for(int i = 1; i <= num; i++){
		      
		      phase += i + " sheep...";
		      
		    }
		    return phase;
		  }
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(countingSheep(2));
	}

}
