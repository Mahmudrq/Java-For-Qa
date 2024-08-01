package day5prb;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter String : ");
	  String str = input.nextLine();
	   String rev = "";
	   int len = str.length();
	   for(int i=len-1;i>=0;i--) {
		   rev= rev+str.charAt(i);
		   
	   }
	    /*System.out.println("Reverse Sentence " +rev);
	   StringBuffer sb = new StringBuffer(str);*/
	   System.out.println("Reverse String : "  + rev);

	}

}
