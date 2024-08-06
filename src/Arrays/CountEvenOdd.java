package Arrays;

public class CountEvenOdd {
	  public static int[] countEvenOdd(int[] arr) {
	        int evenCount = 0;
	        int oddCount = 0;
	        
	   
	        for (int num : arr) {
	            if (num % 2 == 0) {
	                evenCount++;
	            } else {
	                oddCount++;
	            }
	        }
	        return new int[]{evenCount, oddCount};
	    }

	    public static void main(String[] args) {
	    	 int[] numbers = {10, 21, 32, 43, 54, 65};
	         
	         int[] counts = countEvenOdd(numbers);
	         int evenCount = counts[0];
	         int oddCount = counts[1];
	         
	         System.out.println("Number of even numbers: " + evenCount);
	         System.out.println("Number of odd numbers: " + oddCount);
	     }
	
	    }


