package day7;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		int a []= {2,1,9,4,7,6,5,8};
		System.out.println("Before Sorting......");
		System.out.println(Arrays.toString(a));
		/*for(int x:a) {
			System.out.println(x);
		}*/
		Arrays.sort(a);
       System.out.println("After Sorting...." );
       System.out.println(Arrays.toString(a));
	}

}
