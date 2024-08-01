package day19;


//Upcasting -- converting value smaller to higher

//int ---> long
//float --> double
//Downcasting -- converting value higher to smaller

public class TypeCasting {

	public static void main(String[] args) {
		
 //Upcasting
		
		/*int  intvalue = 100;
		long longvalue = intvalue;
		System.out.println(longvalue);*/
		
		//float floatvalue = 10.5f;
		//double doublevalue = floatvalue ;
		
		//Downcasting
		
		//long longvalue = 10000100;
		//int intvalue = (int)longvalue;
		//double doublevalue = 555.5;
		//float floatvalue = (float) doublevalue;
		
		//Example 1
	/*	int i = 100;
		double d= i;
		System.out.println(d); // upcasting
		
		*/
		
		
		double d = 10.5; //downcasting
				int i = (int)d;
		System.out.println(i);
		
		
		
	}

}
