package StringIndexOutOfBoundsExceptionDemo;

public class StringIndexOutOfBoundsExceptionDemo {
public static void main(String[] args) {
	try {
		String name = "rahulkumar";
		char charAt = name.charAt(20);
		 System.out.println("Character at index 20: " + charAt);
         
    } catch (StringIndexOutOfBoundsException e) {

		  System.out.println("String IndexOut Of BoundsException caught: " + e.getMessage());
	      
	}
}
}
