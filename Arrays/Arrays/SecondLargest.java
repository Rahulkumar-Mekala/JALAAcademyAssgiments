package Arrays;

public class SecondLargest {
 
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

          int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
              
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new RuntimeException("There is no second largest element in the array");
        }

        return secondLargest;
    }

    public static void main(String[] args) {
      
        int[] numbers = {10, 20, 4, 45, 99};

        try {
            int secondLargest = findSecondLargest(numbers);
            System.out.println("The second largest number is: " + secondLargest);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
