package NoSuchMethodExceptionDemo;

import java.lang.reflect.Method;

public class NoSuchMethodExceptionDemo {
	public String existingField = "I exist!";
	
	public static void main(String[] args) {
		try {
			NoSuchMethodExceptionDemo demo = new NoSuchMethodExceptionDemo();
			Class<? extends NoSuchMethodExceptionDemo> class1 = demo.getClass();
 Method method = class1.getMethod("nonExistentField");
			  System.out.println("Method found: " + method.getName());
		 } catch (NoSuchMethodException e) {
	              System.out.println("No Such FieldException caught: " + e.getMessage());
	            
		} catch (Exception e) {
			   System.out.println("An unexpected exception occurred: " + e.getMessage());
			   
		}
	}
}
