package generateArithmeticException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arharcardnumber {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println(" Enter the Enter the number  : ");
			int number = scanner.nextInt();
			System.out.println(" Enter the Enter the number  : ");
			int number2 = scanner.nextInt();
			if (number2==0) {
				throw new ArithmeticException(" Invalidate Divisible by zero ");

				
			}
				 
			 else {
				 Double Result = (double) (number/number2);
				System.out.println(" the Result : "+Result);				
			}
			 
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		}
		catch (InputMismatchException e) {
			System.err.println("Error: Invalid input! Please enter an integer."+e.getMessage());
		}
		finally {
			System.out.println(" this is a final block");
		}
	
	}

}
