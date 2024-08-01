package day19;

class Parent{
	
	String  name = "John";
	void m1() {
		System.out.println("This is from Parent..");
	}
}
class Child extends Parent {
	
	int id = 101;
	void m2() {
		System.out.println("This is from Child .. ");
	}
	
}




public class TypeCastingForObject {

	public static void main(String[] args) {
		 
		
		/*Child c= new Child ();
		System.out.println(c.name);
		System.out.println(c.id);
		c.m1();
		c.m2(); */
		
		/*Parent p = new Child();// Upcasting
		System.out.println(p.name);
		p.m1(); */
		
		//DownCasting
		Parent  p = new Parent ();
		Child c =(Child) p ;
		System.out.println(c.name);
		System.out.println(c.id);
		c.m1();
		c.m2();
		

	}

}
