package JAVABasics;

import java.util.Scanner;

public class Assigment2 {
	public  void printname() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter the Your name : ");
		String name = scanner.nextLine();
		
		 System.out.println( " your name is : "+ name );
	}
	 public static void main(String[] args) {
		Assigment2 assigment2 = new Assigment2();
		assigment2.printname();
	}
}
