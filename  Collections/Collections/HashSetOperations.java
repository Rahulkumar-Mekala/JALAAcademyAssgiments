package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetOperations {
	public static void main(String[] args) {
		 HashSet<String> set = new HashSet<>();
	        set.add("Apple");
	        set.add("Banana");
	        set.add("Cherry");
	        set.add("Date");
	        set.add("Fig");
	        set.add("Grape");
	        set.add("Honeydew");
	        set.add("Ivy");
	        set.add("Jackfruit");
	        set.add("Kiwi");
	        set.add("Lemon");
	        set.remove("Date");
	        boolean hasElement = set.contains("Cherry");
	        System.out.println("Set contains 'Cherry': " + hasElement);

	        boolean isEmpty = set.isEmpty();
	        System.out.println("Set is empty: " + isEmpty);
	        System.out.println("Size of the HashSet: " + set.size());

	        System.out.println("All elements in the HashSet:");
	        for (String element : set) {
	            System.out.println(element);
	        }
	        System.out.println("Iterating through the HashSet using Iterator:");
	        Iterator<String> iterator = set.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	
	HashSet<String> clonedSet = (HashSet<String>) set.clone();
    System.out.println("Cloned HashSet:");
    System.out.println(clonedSet);

    // Remove all elements from the HashSet
    set.clear();
    System.out.println("HashSet after clearing all elements:");
    System.out.println(set);

}

}