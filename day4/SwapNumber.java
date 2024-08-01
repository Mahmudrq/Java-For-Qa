package day4;

public class SwapNumber {

	public static void main(String[] args) {
	int 	a = 10 , b= 20 ;
	System.out.println("Number Before Swap " +a+ " " +b);
	/*int t=a ;
	a=b;
	b=t;*/
	
	/*a=a+b;
	b=a-b;
	a=a-b;*/
	
	
	a=a*b;
	b=a/b;
	a=a/b;
	
	System.out.println("Number After Swap " +a+ " " +b);
	}

}
