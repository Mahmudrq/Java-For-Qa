package day18;

public class FinallyBlock {

	public static void main(String[] args) {
		
		String s = "Welcome";
		try {
			
			System.out.println(s.length());
		}
		
		
		catch(NullPointerException e) {
	    	   
	    	   System.out.println("Invalid Data");
	           System.out.println(e.getMessage());	
	       }
		 finally {
			 
			 System.out.println("You entered finally block...");
		 }
	       
	       System.out.println("Program is Finished....");
	      

	}

}
