package Loops;

import java.util.Scanner;

public class switchevenodd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter the Number :");
		int number = scanner.nextInt();
		switch (number%2) {
		case 0:
			System.out.println(number+" Even Number");
			break;
			case 1:
				System.out.println(number+" Odd Number ");
				
			
			break;

		default:
			System.err.println(" Invalidate Input : ");
			break;
		}
	}

}
