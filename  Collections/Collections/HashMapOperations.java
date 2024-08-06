package Collections;

import java.util.HashMap;
import java.util.Set;

public class HashMapOperations {
	public static void main(String[] args) {
		HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(104, "David");
        studentMap.put(105, "Eve");
        studentMap.put(106, "Frank");
        studentMap.put(107, "Grace");
        studentMap.put(108, "Hank");
        studentMap.put(109, "Ivy");
        studentMap.put(110, "Jack");
        studentMap.put(111, "Karen");
        String name = studentMap.get(104); 
        System.out.println("Student with ID 104: " + name);
        HashMap<Integer, String> clonedMap = (HashMap<Integer, String>) studentMap.clone();
 
        boolean hasKey = studentMap.containsKey(103);
        System.out.println("Map contains ID 103: " + hasKey);

        boolean hasValue = studentMap.containsValue("Eve");
        System.out.println("Map contains student named Eve: " + hasValue);
        boolean isEmpty = studentMap.isEmpty();
        System.out.println("Map is empty: " + isEmpty);
        System.out.println("Size of the Map: " + studentMap.size());

        System.out.println("All student IDs:");
        Set<Integer> keys = studentMap.keySet();
        for (Integer key : keys) {
            System.out.println(key);
        }
        System.out.println("All student names:");
        for (String value : studentMap.values()) {
            System.out.println(value);
       

            
        }
        studentMap.remove(107);

        HashMap<Integer, String> newMap = new HashMap<>(studentMap);
        System.out.println("New Map after copying all elements from the original map:");
        System.out.println(newMap);
    }

	}


