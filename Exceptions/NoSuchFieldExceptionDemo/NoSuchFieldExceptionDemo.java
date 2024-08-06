package NoSuchFieldExceptionDemo;

import java.lang.reflect.Field;

public class NoSuchFieldExceptionDemo {
	public String existingField = "I exist!";
	
	public static void main(String[] args) {
		try {
			NoSuchFieldExceptionDemo demo = new NoSuchFieldExceptionDemo();
			Class<? extends NoSuchFieldExceptionDemo> class1 = demo.getClass();
			Field field = class1.getField("nonExistentField");
			  System.out.println("Field found: " + field.getName());
		 } catch (NoSuchFieldException e) {
	              System.out.println("No Such FieldException caught: " + e.getMessage());
	            
		} catch (Exception e) {
			   System.out.println("An unexpected exception occurred: " + e.getMessage());
			   
		}
	}
	}
