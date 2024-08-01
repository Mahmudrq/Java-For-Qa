package day15;

class ABC {
	
	void m1(int a) {
		System.out.println(a);
	}
	void m2(int b) {
		System.out.println(b);
	}
}

class XYZ extends ABC { // 3 Methods
	
	void m1(int a) {
		System.out.println(a*a);  //Overriding
	}
	
	void m2(int a , int b) {
		System.out.println(a+b); //Overloading
	}
}

public class OverloadingVsOvweridding {

	public static void main(String[] args) {
		XYZ objxyz = new XYZ ();
		objxyz.m1(10);
		objxyz.m2(20);
		objxyz.m2(10, 20);

	}

}
