package day19;


public class TypeCastingObject3 {

	public static void main(String[] args) {
	     //Example 1
		//Object o = new String ("Welcome");
		//StringBuffer sb = (StringBuffer) o ;

		//Example 2
		//String s = new String ("Welcome");
		//StringBuffer sb = (StringBuffer) s;
		
		//Example 3
		
		//Object o = new String("Welcome");
		//StringBuffer sb = (StringBuffer)  o ;
		
		//Example 4
		
		//Object o = new String ("Welcome");
		//StringBuffer  sb = (String) o ;
		
		//Example 5
		
		//String s = new String ("welcome");
		//StringBuffer sb = (String) s ;
		
		//Example 6
		//Object o = new String ("Welcome");
		//StringBuffer sb = (StringBuffer) o ;
		
		//Example 7
		Object o = new  String ("Welcome");
		String s = (String) o ;
		System.out.println(s);
	}
	

}
