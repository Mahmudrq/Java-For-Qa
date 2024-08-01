package day18;

import java.util.Scanner;

public class ExeptionsDemo {

	public static void main(String[] args) {
		System.out.println("Program is Started");
		Scanner sc = new Scanner(System.in);
		
		
		//Example 1
		/*System.out.println("Enter a Number ");
		int num = sc.nextInt();
		System.out.println(100/num);*/
		
		//Example 2
		/*int a[]= new int[5];
		System.out.println("Enter The Postion(0-4):");
		int  pos = sc.nextInt();
		
		System.out.println("Enter Value");
		int value = sc.nextInt();
		a[pos]=value;
		System.out.println(a[pos]);*/
		
		//Example 3
		/*String s = "1234";
		int num= Integer.parseInt(s);
		System.out.println(num);*/
		
		//Example 4
		String s = "Welcome";
		System.out.println(s.length());
		
		System.out.println("Program is Completed");
		System.out.println("Program is Exited");

	}

}
