package day4;

import java.util.Scanner;

public class positivenegitive {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter Number :");
		int number = input.nextInt();
		if(number>0) {
			System.out.println("Positive Number ");
		}
		else if (number<0) {
			System.out.println("Negitive Number");
		}
		else {
			System.out.println("Zero");
			
		}

	}

}
