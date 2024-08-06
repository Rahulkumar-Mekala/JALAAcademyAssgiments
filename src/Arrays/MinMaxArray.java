package Arrays;

public class MinMaxArray {
  
    public static int[] findMinMax(int[] arr) {
      
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        
     
        int min = arr[0];
        int max = arr[0];
        
  
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
     
        return new int[]{min, max};
    }

    public static void main(String[] args) {
       
        int[] numbers = {10, 20, 30, 40, 50};
        
        int[] minMax = findMinMax(numbers);
        int min = minMax[0];
        int max = minMax[1];
        
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
