package Arrays;

public class ArrayContains {
	public static boolean Contains(int array[],int value) {
		for (int i : array) {
			 if (i==value) {
				 return true;
				
			}
			
		}
		return false;
	}
	
		public static void main(String[] args) {
	       
	        int[] numbers = {10, 20, 30, 40, 50};
	        int targetValue = 30;

	        if (Contains(numbers, targetValue)) {
	            System.out.println("The array contains the value " + targetValue);
	        } else {
	            System.out.println("The array does not contain the value " + targetValue);
	        }
	    }
	}