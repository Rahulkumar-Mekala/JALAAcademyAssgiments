package Arrays;

import java.util.Arrays;

public class ArrayCopy {

    public static int[] copyArray(int[] original) {
     
        int[] copy = new int[original.length];
        
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        
        return copy;
    }

    public static void main(String[] args) {
      
        int[] originalArray = {10, 20, 30, 40, 50};
        
        int[] copiedArray = copyArray(originalArray);
        
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));
    }
}

