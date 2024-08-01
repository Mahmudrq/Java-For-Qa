package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String[] args) {
        // Declaration
        HashSet myset = new HashSet();
        // Set<Object> myset = new HashSet<>();
        // HashSet<String> myset = new HashSet<String>();

        // Adding values
        myset.add(100);
        myset.add(10.5);
        myset.add("welcome");
        myset.add('A');
        myset.add(true);
        myset.add(null);
       System.out.println(myset);
       
       //Hash Size
       System.out.println("HashSet size is :"+myset.size());
       
       //Remove element 
        myset.remove(10.5);
        System.out.println("After removing : "+myset);
        
        //Inserting element is not possible in HashSet
        // Access specific element is not possible 
        
        //Convert HashSet to ArrayList
        
        ArrayList al = new ArrayList(myset);
        System.out.println(al);
        System.out.println(al.get(2));
        
        //Read all element using for...each
       /* for(Object x:myset) {
        	System.out.println(x);}*/
        	
        	//Using Iterator
        	Iterator it = myset.iterator();
        	while(it.hasNext()) {
        		System.out.println(it.next());
        	}
        	
        	//Clearing elements
        	myset.clear();
        	System.out.println(myset);
        	System.out.println(myset.isEmpty());
        	
        }
        
        
    }

