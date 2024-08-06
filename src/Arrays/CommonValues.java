package Arrays;

import java.util.HashSet;
import java.util.Set;

import java.util.List;
import java.util.ArrayList;

public class CommonValues {
  
    public static List<Integer> findCommonValues(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> common = new HashSet<>();
  
        for (int num : array1) {
            set1.add(num);
        }
        
        for (int num : array2) {
            if (set1.contains(num)) {
                common.add(num);
            }
        }
        
        return new ArrayList<>(common);
    }

    public static void main(String[] args) {
     
        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = {30, 40, 50, 60, 70};
        
        List<Integer> commonValues = findCommonValues(array1, array2);
        
        System.out.println("Common values: " + commonValues);
    }
}
