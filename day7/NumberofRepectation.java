package day7;

public class NumberofRepectation {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,40,50,40};
		int num = 40;
		int count = 0;
		for(int x:a) {
			if(x==num) {
				count++ ;
			}
		}
		System.out.println(count);

	}

}
