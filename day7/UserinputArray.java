package day7;

import java.util.Arrays;
import java.util.Scanner;

public class UserinputArray {

	public static void main(String[] args) {
		int a []=new int [5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			
			System.out.println("Enter a number for position "+i+":");
			a[i]=sc.nextInt();
		}
		System.out.println("Printing Array Elements....");
		System.out.println(Arrays.toString(a));

	}

}
