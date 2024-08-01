package day4;

import java.util.Scanner;

public class TwoNumber {

	public static void main(String[] args) {
	 Scanner input  = new Scanner (System.in);
	System.out .println("Enter A :"); 
	 int a = input.nextInt();
	 Scanner input1  = new Scanner (System.in);
		System.out .println("Enter B "); 
		 int b = input.nextInt();
	 
	 String res=(a<b)? "A is small " : "B is small";
	 System.out.println(res);

	}

}
