package day4;

import java.util.Scanner;

public class evanodd {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter Number :");
		int number = input.nextInt();
		if(number%2==0) {
			System.out.println("Evan");
			
		}
		else {
			System.out.println("Odd");
		}
	}

}
