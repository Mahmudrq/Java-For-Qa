package day9;

import java.util.Scanner;

public class ReverseAstring {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.nextLine();
		String rev = "";
		/*for (int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
     System.out.println("Reverse Done : "+rev);
	}*/ //Approch 1
		
		/*char a[]=s.toCharArray();
		for(int i=a.length-1;i>=0;i--) {
			rev=rev+a[i];
		}
		System.out.println("Reverse String : " +rev); */ //Approch 2
		
		//StringBuffer s = new StringBuffer("Welcome");
		//System.out.println("Reverse String is : " +s.reverse()); //Approch 3
		
		StringBuilder s = new StringBuilder("Welcome");
		System.out.println("Reverse Done : "+s.reverse());
		
	}

}
