package Loops;

import java.util.Scanner;

public class Armstrongnumber {
	
	public static void main(String[] args) {
		int temp,a,arm = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter the Armstrong number : ");
		int number = scanner.nextInt();
		temp =number;
		while (number!=0) {
			a= number%10;
			arm = arm+(a*a*a);
			number=number/10;
			
			
		}
		if(arm==temp)
			System.out.println(temp+" is a armstrong number ");
			else
			System.out.println(temp+" is not a armstrong number ");
		}
		
	}


