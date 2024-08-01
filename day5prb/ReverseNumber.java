package day5prb;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out .println("Enter a number : ");
		int number = input.nextInt();
		int rev = 0 ;
		while(number != 0) {
			rev= rev*10 + number%10 ; // 0*10 = 0 -- 1234%10 = 4
			number = number / 10 ; 
		              }// 1234/10 = 123
		
		  /* StringBuilder abc =new StringBuilder() ;
		   abc.append(number);
		   StringBuilder rev = abc.reverse();*/
		 
         System.out.println("Reverse Number " + rev);
	}

}
