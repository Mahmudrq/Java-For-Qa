package day13;

public class StaticKeyword {

	
	  static int a = 10;
	  int b =20;
	  
	 static void m1() {
		  System.out.println("This is m1 staic method ");
		  	
	  }
	 
	 void m2() {
		 
		 System.out.println("This is m2 non-static method");
	 }
	 
	 void m() {
		 System.out.println(a);
		 System.out.println(b);
		 m1();
		 m2();
	 }
	
	public static void main(String[] args) {
		// System.out.println(a);  //static
		// m1();
           
		 
		StaticKeyword st = new StaticKeyword();
	//	System.out.println(st.b);
		//st.m2();
		st.m();
	}

}
