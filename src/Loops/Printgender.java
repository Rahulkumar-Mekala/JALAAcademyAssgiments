package Loops;

import java.util.Scanner;

public class Printgender {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter the M or F ");
		char gender = scanner.next().charAt(0);
		switch (gender) {
		case 'M':
			System.out.println(" Male :");
			
			break;
		case 'F':
			System.out.println(" Female :");
			
			break;

		default:
			System.err.println("Invalidate Inputs : ");
			break;
		}
	}

}
