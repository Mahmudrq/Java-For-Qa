package day4;

import java.util.Scanner;

public class largestnumber {

	public static void main(String[] args) {
		Scanner input1 = new Scanner (System.in);
		System.out.println("Enter a :");
		int a = input1.nextInt();
		Scanner input2 = new Scanner (System.in);
		System.out.println("Enter b :");
		int b = input2.nextInt();
		Scanner input3 = new Scanner (System.in);
		System.out.println("Enter c :");
		int c = input3.nextInt();
		if(a>b && a>c) {
			System.out.println("A is Largest " +a);
		}
		
		else if (b>a && b>c) {
			System.out.println("B is Largest" +b);
		}
		else {
			System.out.println("C is Largest" +c);
		}
	}

}
