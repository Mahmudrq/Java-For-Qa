package day9;

import java.util.Arrays;

public class mutableVsinmutable {

	public static void main(String[] args) {
		int a[]= {20,10,30,40,50};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);//mutable
		System.out.println(Arrays.toString(a));
		
		
		//inmutable
		
		String s = new String ("welcome");
		System.out.println(s);
		String Concating =s.concat(" To Java "); 
		System.out.println(s);
		System.out.println(Concating);

	}

}
