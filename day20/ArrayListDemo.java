package day20;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();

        mylist.add(100);
        mylist.add(10.5);
        mylist.add("welcome");
        mylist.add('A');
        mylist.add(true);
        mylist.add(100);
        mylist.add(null);
        mylist.add(null);

        // Size of arraylist
        System.out.println("Size of arraylist: " + mylist.size());

        // Printing data from arraylist
        System.out.println("Printing data: " + mylist);

        // Remove data
        mylist.remove(5);
        System.out.println("After removing data: " + mylist);

        // Insert an element in arraylist
        mylist.add(2, "java");
        System.out.println("After adding data: " + mylist);

        // Modify element in arraylist
        mylist.set(2, "Python");
        System.out.println("After modifying data: " + mylist);

        // Access specific element from arraylist
        System.out.println("Element at index 3: " + mylist.get(3));

        // Reading all elements from arraylist using normal for loop
        /*
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }
        */

        // for each method
        /*
        for (Object x : mylist) {
            System.out.println(x);
        }
        */

        // using iterator
        /*
        Iterator<Object> it = mylist.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        */

        // Checking if arraylist is empty or not
        System.out.println("Is arraylist empty: " + mylist.isEmpty());

        // Remove multiple elements from arraylist
        ArrayList mylist2 = new ArrayList();

        mylist2.add(100);
        mylist2.add("welcome");

        // Remove all elements in mylist2 from mylist
        mylist.removeAll(mylist2);
        System.out.println("After removing multiple elements: " + mylist);
        
        // remove all elements
        mylist.clear();
        System.out.println("Is Arraylist empty ? :"+mylist.isEmpty());
    }
}
