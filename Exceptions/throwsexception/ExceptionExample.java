package throwsexception;

import java.util.Scanner;

public class ExceptionExample {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println(" Enter the  frist Elements :");
			int number = scanner.nextInt();
			System.out.println(" Enter the  second Elements :");
			int number2 = scanner.nextInt();
			
		if (number2==0) {
			 throw new ArithmeticException("Division by zero is not allowed. ");
			
		} else {
			Integer sum  =number/number2;
			System.out.println(" the Result :"+ sum);

		}
	}catch (ArithmeticException e) {
		System.err.println(e.getMessage());
		
	}
 }
}