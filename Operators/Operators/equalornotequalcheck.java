package Operators;

import java.util.Scanner;

public class equalornotequalcheck {
	public void equal() {
		Scanner scanner = new Scanner(System.in);
		System.out.println( " Enter the FirstElement :");
		Integer Element = scanner.nextInt();
		System.out.println( " Enter the SecondElement :");
		Integer Element2 = scanner.nextInt();
		 if (Element==Element2) {
			 System.out.println( " both are number are equal : "+ Element + "  : "+Element2);
			
		} else {
			 System.err.println( " both are number are not equal : "+  Element + "  : "+Element2);
				
		}
		
	}
	public static void main(String[] args) {
		equalornotequalcheck equal= new equalornotequalcheck();
		equal.equal();
		
	}

}
