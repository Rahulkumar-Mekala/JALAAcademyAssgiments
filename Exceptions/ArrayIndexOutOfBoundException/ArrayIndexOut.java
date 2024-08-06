package ArrayIndexOutOfBoundException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayIndexOut {
	public static void main(String[] args) {
		try {
			int number[]= new int [10];
			 int index=20;
			if (index>=0&&index<number.length) {
				
				System.out.println(number[index]);
			} else {
				throw new ArrayIndexOutOfBoundException("Array Index Out Of Bound Exception  : ");
				
			}
			
		} catch (ArrayIndexOutOfBoundException e) {
			System.err.println(e.getMessage());
		}
		finally {
			System.out.println(" this is a final block");
		}
	
	}

}
