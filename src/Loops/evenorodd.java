package Loops;

import java.util.Scanner;

public class evenorodd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter the number : ");
		int number = scanner.nextInt();
		if (number%2==0) {
			System.out.println(" It is Even number : "+ number);
			
		} else {
			System.err.println(" It is Odd1 number : "+ number);
			
		}
	}
}
