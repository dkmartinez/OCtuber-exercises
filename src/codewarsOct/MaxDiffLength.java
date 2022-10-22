package codewarsOct;

public class MaxDiffLength {
	
	   public static int mxdiflg(String[] a1, String[] a2) {
		   
		   if(a1.length == 0 || a2.length == 0) {
			   return -1;
		   }
		   int a1size = 0;
		   int a2size = 0;
		   
		   
		   for(int i = 0; i < a1.length; i++) {
			   a1size =  a1[i].length();
			
		   }
		   for(int i = 0; i < a2.length; i++) {
			   a2size +=  a2[i].length();
		   }
		  
		   if(a1size < a2size) {
			   return a2size - a1size;
		   }
		   return a1size - a2size;
		   
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub2571
		String[] s1 = new String[]{"hoqq", "jjjjjj"};
		String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
		
		System.out.println(mxdiflg(s1,s2));
		

	}

}
