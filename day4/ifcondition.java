package day4;

import java.util.Scanner;

public class ifcondition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
	    System.out.println("Enter Person Age");
	    int person_age = input.nextInt();
		
		if(person_age>=18) {
             System.out.println("Eligable for vote");
            
	}
		else {
			System.out.println("Not Eligable fort vote ");
		}
	}

}
