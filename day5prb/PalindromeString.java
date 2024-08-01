package day5prb;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		  System.out.println("Enter String : ");
		  String str = input.nextLine();
		   String org_str=str ;
		   String rev = "";
		   int len = str.length();
		   for(int i=len-1;i>=0;i--) {
			   rev= rev+str.charAt(i);
			   
		   }
		   
		   if(org_str.equals(rev)) {
			   System.out.print(org_str+"  is Palindrome String");
		   }
		   else {
			   System.out.print(org_str+ " is Not Palindrome String"); 
		   }

	}

}
