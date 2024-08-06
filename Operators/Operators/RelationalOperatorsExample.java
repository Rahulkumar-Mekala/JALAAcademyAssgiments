package Operators;

import java.util.Scanner;

public class RelationalOperatorsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        boolean lessThan = number1 < number2;
        System.out.println(number1 + " < " + number2 + " : " + lessThan);

        boolean lessThanOrEqualTo = number1 <= number2;
        System.out.println(number1 + " <= " + number2 + " : " + lessThanOrEqualTo);

        boolean greaterThan = number1 > number2;
        System.out.println(number1 + " > " + number2 + " : " + greaterThan);

        boolean greaterThanOrEqualTo = number1 >= number2;
        System.out.println(number1 + " >= " + number2 + " : " + greaterThanOrEqualTo);

        scanner.close();
    }
}
