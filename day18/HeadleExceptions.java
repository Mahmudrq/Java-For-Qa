package day18;

import java.util.Scanner;

public class HeadleExceptions {

	public static void main(String[] args) {
		System.out.println("Program is Started");
		Scanner sc = new Scanner(System.in);
		//Example 1
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		
		try {
		System.out.println(100/num);
		}
		catch(ArithmeticException e) {
			System.out.println("Invalid Data");
		}
		
		System.out.println("Program is Completed");
		System.out.println("Program is Exited");


	}

}
