package day14;


class A{
		int a;
	void display() {
		
		System.out.println(a);	
	}
}
class B extends A{
	int b;
	void print() {
		
		System.out.println(b);	}	
	
}

class C extends B {
	int c ;
	void show() {
		System.out.println(c);
	}
}

public class InheritanceTypes {

	public static void main(String[] args) {
		
      /* B bobj = new B();
       
       System.out.println(bobj.a);
       System.out.println(bobj.b);
       
       bobj.display();
       bobj.print(); */
		
		C cobj = new C();
		cobj.a = 100;
		cobj.b = 200;
		cobj.c = 300;
		
		cobj.display();
		cobj.print();
		cobj.show();
	}

} 
