package Arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
   
    public static List<Integer> findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>(); 
        Set<Integer> duplicates = new HashSet<>(); 
        
        for (int num : arr) {
            if (seen.contains(num)) {
                duplicates.add(num); 
            } else {
                seen.add(num); 
            }
        }
      
        return new ArrayList<>(duplicates);
    }

    public static void main(String[] args) {
        
        int[] numbers = {10, 20, 30, 20, 40, 50, 30, 60, 70};
        
        List<Integer> duplicates = findDuplicates(numbers);
        
        System.out.println("Duplicate values: " + duplicates);
    }
}

