package day10;

public class Empolyee {
	
 //Variable	

	int eid;
	String ename;
	String job;
	int sal;
	//Method
	
	   void display(){
		
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
		
		
	}

	public static void main(String[] args) {
		Empolyee emp1= new Empolyee();
		emp1.eid=101;
		emp1.ename="John";
		emp1.job="Manager";
		emp1.sal= 5000;
		emp1.display();
		Empolyee emp2 = new Empolyee();
		emp2.eid = 102;
		emp2.ename = "Mike";
		emp2.job = "Engineer";
		emp2.sal= 5000;
		emp2.display();
		
		

	}

} 
