package Operators;

import java.util.Scanner;

public class LogicalOperatorsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the first boolean value (true/false): ");
        boolean value1 = scanner.nextBoolean();

        System.out.print("Enter the second boolean value (true/false): ");
        boolean value2 = scanner.nextBoolean();

       
        boolean andResult = value1 && value2;
        System.out.println("Logical AND result: " + andResult);

      
        boolean orResult = value1 || value2;
        System.out.println("Logical OR result: " + orResult);

        
        boolean notResult1 = !value1;
        boolean notResult2 = !value2;
        System.out.println("Logical NOT result for first value: " + notResult1);
        System.out.println("Logical NOT result for second value: " + notResult2);

  
        scanner.close();
    }
}
