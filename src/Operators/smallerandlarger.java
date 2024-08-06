package Operators;



public class smallerandlarger {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 1, 8, 2};  // Example array of numbers

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        
        System.out.println("Smaller number: " + min);
        System.out.println("Larger number: " + max);
    }
}

