package day13;

public class thiskeyword {
    
	int x , y ; 
	
	//class variable/instance variable
	thiskeyword(int x , int y){
		this.x=x;
		this.y=y;
	}
	void display() {
	
	System.out.println(x);
	System.out.println(y);
	}
	public static void main(String[] args) {
		
         thiskeyword tw = new thiskeyword(20,40);
         tw.display();
	}

}
