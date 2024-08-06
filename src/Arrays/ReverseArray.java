package Arrays;

public class ReverseArray {
   
    public static void reverseArray(int[] arr) {
        int left = 0;            
        int right = arr.length - 1;
        
        while (left < right) {
           
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
         
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("Original Array: " + java.util.Arrays.toString(numbers));
        
        reverseArray(numbers);
        
        System.out.println("Reversed Array: " + java.util.Arrays.toString(numbers));
    }
}

