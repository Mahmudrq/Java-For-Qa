package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		//Declaration
		//HashMap hm = new HashMap ();
		 HashMap<Integer, String>hm = new HashMap<Integer,String>();
		
		 //Adding
         hm.put(101, "Mike");
         hm.put(102, "John");
         hm.put(103, "Kim");
         hm.put(104, "Peter");
         System.out.println(hm);
         
         //size 
         System.out.println(hm.size());
         //remove pair
         hm.remove(103);
         System.out.println("After removing pair : "+hm);
         //Access the value
         System.out.println(hm.get(102));
         //get all the keys
           
         System.out.println(hm.keySet());
         System.out.println(hm.values());
         System.out.println(hm.entrySet());
         
         //Reading data from HashMap
       /*  for(int k:hm.keySet()) {
        	 System.out.println(k+" "+hm.get(k));
         } */
         
         //Using Iterator
         
        Iterator<Entry<Integer, String>> it =hm.entrySet().iterator();
        while(it.hasNext()) {
        Entry entry=it.next();
        System.out.println(entry.getKey()+"   "+entry.getValue());
        	
        }
        //clear
        hm.clear();
        System.out.println(hm.isEmpty());
	}

}
