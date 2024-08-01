package day16;

interface Shape {
	int length =  10 ;
	int width = 20 ;
	
	void circle(); //Abstract method
	 
	
	default void suqare() {
		System.out.println("This is square-default method......"); //default method
	}
	 
	
	static  void rectangle() {
		 System.out.println("This is rectangle-static method......."); // static method
	 }
}

public class Interfacedemo implements Shape{
		
	 public void circle() {
		System.out.println("This is a circle.....");
	}
	 
	 
	 void triangle () {
		 System.out.println("This is a triangle");
	 }
	 
	 int x = 100 , y =200 ;
	 
	 public static void main(String[] args) {
	 Interfacedemo id = new Interfacedemo (); //Scenario 1
	  id.circle();// abstract 
	  id.suqare();//default
	  Shape.rectangle();  // static method can directly access from interface
	  id.triangle();
	  System.out.println(id.x+id.y);
      
	 Shape sh = new Interfacedemo (); //Scenario 2 
      sh.circle();
      sh.suqare();
      Shape.rectangle();
      System.out.println(Shape.length*Shape.width);
	}

}
