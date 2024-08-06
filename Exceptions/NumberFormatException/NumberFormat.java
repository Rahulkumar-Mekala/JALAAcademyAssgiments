package NumberFormatException;

import java.util.Scanner;

import AccessModifierspublic.main;

public class NumberFormat {
	public static void main(String[] args) {
			try {
			String invalidNumber = "abc123";
			  int number = Integer.parseInt(invalidNumber); 
		          	System.out.println("the number "+number);
		 } catch (NumberFormatException e) {
	               System.err.println("Number Format Exception caught: " + e.getMessage());
	  
		} 
	}

}
