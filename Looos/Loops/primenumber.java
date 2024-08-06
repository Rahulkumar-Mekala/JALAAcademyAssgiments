package Loops;

import java.util.Scanner;

public class primenumber {
	public static void main(String[] args) {
		int temp=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter the number : ");
		int number = scanner.nextInt();
		if (number==0||number==1) {
			System.out.println(" it is a not prime number : ");
			
		}
		else {
			for (int i = 2; i <number/2; i++) {
				if (number%i==0) {
					System.out.println("it is not prime number : ");
					temp =1;
				break;
				
			}
		}
			if (temp==0) {
				System.out.println(" it is prime number :");
			}
				
		}
	}

}
