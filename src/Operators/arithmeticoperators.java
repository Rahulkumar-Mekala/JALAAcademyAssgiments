package Operators;

import java.util.Scanner;

public class arithmeticoperators {
	 private static Scanner scanner;
	private static arithmeticoperators arithmeticoperators;

	public static void operators() {
		 scanner = new Scanner(System.in);
		  System.out.println( " Enter the Firstname : ");
		 Integer firstelement= scanner.nextInt();
		 System.out.println( " Enter the Secondname : ");
		 Integer secondelement= scanner.nextInt();
		  Integer sum = firstelement+secondelement;
		  System.out.println(" the Sum of value  :"+ sum);
		  Integer sub = firstelement-secondelement;
		  System.out.println(" the Subtraction of value  : "+ sub);
		  Integer mul = firstelement*secondelement;
		  System.out.println(" the Multiplication  of value  :"+ mul);
		  Integer div = firstelement/secondelement;
		  System.out.println(" the division of value  :1 "+ div);
		
		
	}
	 public static void main(String[] args) {
		arithmeticoperators = new arithmeticoperators();
		Operators.arithmeticoperators.operators();
	}

}
