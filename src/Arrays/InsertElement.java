package Arrays;

import java.util.Arrays;

public class InsertElement {
       public static int[] insertElement(int[] original, int element, int position) {
           if (position < 0 || position > original.length) {
            throw new IllegalArgumentException("Invalid position");
        }
        
            int[] newArray = new int[original.length + 1];
            for (int i = 0; i < position; i++) {
            newArray[i] = original[i];
        }
           newArray[position] = element;
            for (int i = position; i < original.length; i++) {
            newArray[i + 1] = original[i];
        }
        
        return newArray; 
    }

    public static void main(String[] args) {
          int[] originalArray = {10, 20, 30, 40, 50};
        int elementToInsert = 25;
        int position = 2;
        
        int[] newArray = insertElement(originalArray, elementToInsert, position);
        
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("New Array with element inserted: " + Arrays.toString(newArray));
    }
}
