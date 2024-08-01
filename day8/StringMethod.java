package day8;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {

	String  s = "  welcome  " ;
	System.out.println("Before Triming " + s.length());//trim
	System.out.println("After Triming  " + s.trim().length());
    System.out.println(s.charAt(7));//charAt
    System.out.println(s.contains("come"));//contains
    System.out.println(s.contains("welme"));
    
    
     String s1= "welcome";
     String s2 = "WELCOME";
     System.out.println(s1==s2);
     System.out.println(s1.equals("Welcome"));
     System.out.println(s1.equalsIgnoreCase(s2));
      
     
     
     String s3= "Welcome Selenium with Java automation";
     
     System.out.println(s3.replace('e', 'x')); // replace 
     System.out.println(s3.replace("Selenium", "playwright"));
     
    //Substring
    String  s4 = "Selenium";
    System.out.println(s4.substring(0, 3));
    
    // touppercase tolowercase
      String s5= "Welcome";
      System.out.println(s5.toUpperCase()) ;    
      System.out.println(s5.toLowerCase());
      
      //split exp1
      String s6 = "rainy@gmail.com";
      String a[]=s6.split("@");
      System.out.println(Arrays.toString(a));
      System.out.println(a[0]);
      System.out.println(a[1]);
      
      String amount="$15,20,30";
      System.out.println(amount.replace("$",""));
      System.out.println(amount.replace("$","").replace(",",""));
           
      //exp2
      
      String s7= "abc,123@xyz";
      String arr1[]=s7.split(",");
      System.out.println(Arrays.toString(arr1));
      
      String arr2[]=arr1[1].split("@");
      System.out.println(Arrays.toString(arr2));
      System.out.println(arr1[0]);
      System.out.println(arr2[0]);
      System.out.println(arr2[1]);
      
      
      //exp3
      String s8="abc 123";
      String ar[]=s8.split(" ");
      System.out.println(Arrays.toString(ar));
      
      //exp4 
      
      String name ="John Kenedy";
      System.out.println(name.replace("J", "j").contains("john"));
      System.out.println(name.toLowerCase().contains("john"));
      
      
      
	}

	}


