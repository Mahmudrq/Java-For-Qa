package day15;

public class Animal {
    String color = "White";
    
    void eat () {
    	System.out.println("Eating....");
    }
}


class Dog extends Animal {
	
	String color = "Black";
	void display() {
		System.out.println(super.color);
	}
	
	void eat () {
		
		//System.out.println("Eating Rice.....");//overriding
		super.eat();
	}
}


