package Arrays;

public class DifferenceMinMax {
     public static int findDifference(int[] arr) {
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

        return max - min;
    }

    public static void main(String[] args) {
          int[] numbers = {10, 20, 5, 30, 15};

        try {
            int difference = findDifference(numbers);
            System.out.println("The difference between the largest and smallest value is: " + difference);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
