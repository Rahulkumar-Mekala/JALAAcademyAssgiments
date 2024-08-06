package createyourownexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arharcardnumber {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println(" Enter the Ardhar card number : ");
			Long number = scanner.nextLong();
			 String Ardhar= number+"";
			 if (Ardhar.length()==12) {
				
				 
				 System.out.println(" Arharcard number : "+ number);
					}
			 else {
				
				 throw new Artharcardexpection(" Invalidate Ardharcard number");
					
			}
			 
		} catch (Artharcardexpection e) {
			System.err.println(e.getMessage());
		}
		catch (InputMismatchException e) {
			System.err.println("Error: Invalid input! Please enter an integer."+e.getMessage());
		}
	
	}

}
