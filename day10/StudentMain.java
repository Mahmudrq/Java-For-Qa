package day10;

public class StudentMain {

	public static void main(String[] args) {
		Student std1 = new Student ();
		std1.sid= 101;
		std1.sname= "Masud";
		std1.grad = 'A';
        std1.printData();
        
        Student std2 = new Student ();
		std2.sid= 102;
		std2.sname= "Murad";
		std2.grad = 'B';
        std2.printData();
	}

}
