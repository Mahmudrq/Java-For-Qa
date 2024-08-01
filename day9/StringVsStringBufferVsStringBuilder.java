package day9;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		String s = "welcome";
		s.concat("To Java"); // inmutable
		System.out.println(s);
		
		//StringBuffer
		//mutable
		StringBuffer s1 = new StringBuffer("Welcome");
		s1.append("TO Java");
		System.out.println(s1);
		
		
		//StringBuilder
		//mutable
		
		StringBuilder s2 = new StringBuilder("Rainy");
		s2.append(" Go Home");
		System.out.println(s2);
		

	}

}
