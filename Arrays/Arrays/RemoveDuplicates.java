package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
   
    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>(); 
        
         for (int num : arr) {
            set.add(num);
        }
       
        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArray[index++] = num;
        }
        
        return uniqueArray; 
    }

    public static void main(String[] args) {
    
        int[] numbers = {10, 20, 30, 20, 40, 50, 30, 60, 70};
        
        int[] uniqueNumbers = removeDuplicates(numbers);
        
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueNumbers));
    }
}
