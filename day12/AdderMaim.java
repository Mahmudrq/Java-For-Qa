package day12;

public class AdderMaim {

	public static void main(String[]args) {
		
		Adder add = new Adder();
		add.sum(); //1
		add.sum(10,50);//2
		add.sum(10,20.5);//3
		add.sum(20.5,20);//4
		add.sum(20,20,100);//5
	}
	

}
