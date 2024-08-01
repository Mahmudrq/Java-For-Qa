package day11;

public class GreetingMain {

	public static void main(String[] args) {
	
        Greetings gr = new Greetings();
        gr.m1();
        String sr= gr.m2();
        System.out.println(sr);
        gr.m3("John");
        String s=gr.m4("Mike");
        System.out.println(s);
	}
	
	

}
