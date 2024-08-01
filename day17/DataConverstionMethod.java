package day17;

public class DataConverstionMethod {

	public static void main(String[] args) {
		// String>>>Int
	/*	String s1 = "10";
		String s2 = "20";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2)); */
		
	/*	//String >>> Double
		String s1 = "10.5";
		String s2 = "20.5";
		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
		*/
		
		//String >> Boolean
		
	/*	String s = "Welcome";
		System.out.println(Boolean.parseBoolean(s));
		String s1 = "true";
		System.out.println(Boolean.parseBoolean(s1)); */
		
		// int boolean double char ....> String
		
		int a = 10;
		double b = 12.5;
		char c = 'A';
		boolean bool = true;
		
		String s = String.valueOf(a);
		System.out.println(s);
		String s1 = String.valueOf(b);
		System.out.println(s1);
		String s2 = String.valueOf(bool);
		System.out.println(s2);
		String s3 = String.valueOf(c);
		System.out.println(s3);

	}

}
