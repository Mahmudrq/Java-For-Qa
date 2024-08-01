package day7;

import java.util.Arrays;

public class CharSorting {

	public static void main(String[] args) {
		//char s []= {'B','D','A','C'};
		
		String s[]= {"Rainy","Masud","ABHI","BABU"};
		System.out.println("Before Sorting....."+Arrays.toString(s));
		Arrays.sort(s);
		System.out.println("After Sorting....."+Arrays.toString(s));
		

	}

}
