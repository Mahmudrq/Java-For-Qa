package day7;

public class SearchingElement {

	public static void main(String[] args) {
	  int a[]= {10,20,30,40,50,60};
	  int search_element = 40;
	  boolean status = false ;
	 /* for(int i=0;i<a.length;i++)*/
	  
	  for(int x:a)
	  
	  {
		  
		  if(x==search_element) {
			  System.out.println("Element Found : " +search_element);
			  status=true;
			  break;
		  }
		  
	  }
	  if(status==false) {
	  System.out.println("Elemnet Not Found");
	  }
	  

	}

}
