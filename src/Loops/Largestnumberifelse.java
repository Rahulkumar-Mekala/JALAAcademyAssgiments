package Loops;

public class Largestnumberifelse {

	    public static void main(String[] args) {
	        // Variables holding the numbers
	        int num1 = 10;
	        int num2 = 20;
	        int num3 = 30;

	        // Finding the largest number using multiple if-else statements
	        int largest;
	        if (num1 >= num2 && num1 >= num3) {
	            largest = num1;
	        } else if (num2 >= num1 && num2 >= num3) {
	            largest = num2;
	        } else {
	            largest = num3;
	        }

	        // Displaying the largest number
	        System.out.println("The largest number is " + largest);
	    }
	}


