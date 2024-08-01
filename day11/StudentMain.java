package day11;

import day11.Student;

public class StudentMain {


		 public static void main(String[] args) {
		        //Student stu = new Student();
		        // s.sid = 101;   using object reference value
		        // s.sname = " Mike";
		        // s.grad = 'F';

		        
		        
		        //Using Method
		       // stu.setStudentData(101, "Mike", 'A');
		      //  stu.printStdData(); 
		        
		        
		        
		        //Using Constructor
			 
			 
			 Student std = new Student(101,"Mike ", 'A');
			 std.printStdData();
		        
		        

	}

}
