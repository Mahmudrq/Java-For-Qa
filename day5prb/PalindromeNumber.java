package day5prb;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out .println("Enter a number : ");
		int number = input.nextInt();
		int rev_number = 0 ;
		int org_number = number ;
		while(number != 0) {
			rev_number= rev_number*10 + number%10 ;  
			number = number / 10 ; 
		              }
		if(org_number==rev_number) {
			System.out.println(org_number+" Palindrome Number");
		}
		else {
			
			System.out.println(org_number+" Not Palindrome Number");
		}
	}

}
