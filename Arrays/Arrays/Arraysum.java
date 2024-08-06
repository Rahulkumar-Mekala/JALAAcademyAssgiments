package Arrays;

public class Arraysum {
	public static int sumarray(int []arr) {
		int sum=0;
			for (int i : arr) {
				sum= sum+i;
			}	
		return sum;

		
	}
	public static void main(String[] args) {
		int number[]= {10,20,30,40,50};
		int result = sumarray(number);
		System.out.println("The sum of the array elements is: " + result);
	}

}
