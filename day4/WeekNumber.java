	package day4;

import java.util.Scanner;

public class WeekNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter Day :");
		String day = input.nextLine();
		switch(day) {
		case "Sunday" : System.out.print("1");break ;
		case "Monday" : System.out.print("2"); break;
		case "Tuesday" : System.out.print("3");break ;
		case "Wednesday" : System.out.print("4");break;
		case "Thurday" : System.out.print("5");break;
		case "Friday" : System.out.print("6");break;
		case "Saturday" : System.out.print("7");break;
		default : System.out.println("Invalid Number");
		}

	}

}
