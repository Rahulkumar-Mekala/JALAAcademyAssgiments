package ownmessageArithmeticException;

import java.util.Scanner;

public class ArithmeticException {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter the frist Elements :");
		Integer number = scanner.nextInt();
		System.out.println(" Enter the frist Elements :");
		Integer number2 = scanner.nextInt();
	
		Double sum = (double) (number/number2);
		System.out.println(sum);
		
		 
	}

}
