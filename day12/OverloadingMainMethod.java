package day12;

public class OverloadingMainMethod {

	
	void main(int x) {
		System.out.println(x);
	}
	void main(String x) {
		System.out.println(x);
	}
	void main(String s1 , String s2) {
		System.out.println(s1+ s2);
	}
	
	
	
	
	public static void main(String[] args) {
		
         OverloadingMainMethod oc = new OverloadingMainMethod();
         oc.main(100);
         oc.main("Mike");
         oc.main("Hello " ,"Mike");
	}

}
