package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOperations {
	   public static void main(String[] args) {
	      
		   ArrayList<String> list = new ArrayList<>();
	        for (int i = 1; i <= 10; i++) {
	            list.add("Element " + i);
	        }


	        System.out.println("Iterating through the ArrayList:");
	        Iterator<String> iterator = list.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }

	  
	        list.add(5, "Inserted Element");

	         list.remove("Element 3"); 
            list.remove(2); 
            list.set(4, "Updated Element"); 
         String elementAtIndex4 = list.get(4);
        System.out.println("Element at index 4: " + elementAtIndex4);
          String element = list.get(3);
       System.out.println("Element at index 3: " + element);
          System.out.println("Size of the ArrayList: " + list.size());

	           boolean containsElement = list.contains("Element 1");
        System.out.println("Contains 'Element 1': " + containsElement);

	           list.clear();
	        System.out.println("ArrayList cleared. Size now: " + list.size());
	    }
	}
