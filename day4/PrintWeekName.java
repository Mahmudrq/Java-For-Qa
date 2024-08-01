package day4;

import java.util.Scanner;

public class PrintWeekName {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter Number : ");
		int number = input.nextInt();
		
		if(number==1) {
			System.out.println("Sunday");
		}
		else if(number==2) {
			System.out.println("Monday");
		}
		else if (number==3) {
			System.out.println("Tuesday");
		}
		else if(number==4) {
			System.out.println("Wednesday");
		}
		else if (number==5) {
			System.out.print("Thursday");
		}
		else if (number==6) {
			System.out.println("Friday");
		}
		else {
			System.out.println("Invaild");
		}
	}

}
