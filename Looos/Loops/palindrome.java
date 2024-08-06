package Loops;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		String name ="",reverse= "";
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter The  name are Element : ");
		 name = scanner.nextLine();
		for (int i= name.length()-1; i>=0; i--) {
			 reverse= reverse+name.charAt(i);
		}
			 if (reverse.equals(name)) {
				 System.out.println("  It is a palindrome :  ");
				
			} else {
             System.err.println(" it  is not a palindrome :  ");
			}
			
		
	}

}
