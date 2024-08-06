package MultipleCatch;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Addition {
	public static void main(String[] args) {
		
		        try {
			Scanner scanner = new  Scanner(System.in);
			System.out.println(" Enter the First Element :");
			int number = scanner.nextInt();
			System.out.println(" Enter the second Element :");
			int number2 = scanner.nextInt();
			if (number2==0) {
				throw new ArithmeticException("Division by zero is not allowed.");
			}
			else {
				 Integer Result = number/number2;
				 System.out.println("Result "+ Result);
			}
			
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		catch (InputMismatchException e) {
			System.err.println("Error: Invalid input! Please enter an integer."+e.getMessage());
		}
	}
	

}
