package Arrays;

import java.util.Arrays;

public class RemoveElement {
  
    public static int[] removeElement(int[] arr, int element) {
        
        int count = 0;
        for (int num : arr) {
            if (num == element) {
                count++;
            }
        }
        
      
        if (count == 0) {
            return arr;
        }
        
       
        int[] result = new int[arr.length - count];
        int index = 0;
        
       
        for (int num : arr) {
            if (num != element) {
                result[index++] = num;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
      
        int[] numbers = {10, 20, 30, 40, 50, 30};
        int elementToRemove = 30;
        
        int[] resultArray = removeElement(numbers, elementToRemove);
        
        System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(resultArray));
    }
}
