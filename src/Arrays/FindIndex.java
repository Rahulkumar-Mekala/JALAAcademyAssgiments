package Arrays;

public class FindIndex {
	public static int findindex(int arr[],int element) {
		 for (int i = 0; i < arr.length; i++) {
			if (arr[i]==element) {
				return i;
				
			}
			
		}
		return -1 ;
		
	}
	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40, 50};
        int targetElement = 30;
        int index = findindex(numbers, targetElement);
        
        if (index != -1) {
            System.out.println("The element " + targetElement + " is at index: " + index);
        } else {
            System.out.println("The element " + targetElement + " is not in the array.");
        }
    }
}
