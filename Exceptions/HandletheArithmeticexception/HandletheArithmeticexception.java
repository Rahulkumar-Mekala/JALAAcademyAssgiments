package HandletheArithmeticexception;

import java.util.Scanner;

public class HandletheArithmeticexception {
	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println(" Enter the frist Elements :");
			Integer number = scanner.nextInt();
			System.out.println(" Enter the frist Elements :");
			Integer number2 = scanner.nextInt();
		
			Double sum = (double) (number/number2);
			System.out.println(sum);
		} catch (ArithmeticException e) {
		   System.err.println("An ArithmeticException occurred: "+e.getMessage());
		}
	}

}
