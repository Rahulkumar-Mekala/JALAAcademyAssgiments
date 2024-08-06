package ClassNotFoundExceptionDemo;

public class Demo {
	public static void main(String[] args) {
		try {
             String className = "com.example.NonExistentClass";
            Class<?> class1 = Class.forName(className);
            System.out.println("Class loaded successfully: " + class1.getName());
            
        } catch (ClassNotFoundException e) {
            
            System.out.println("ClassNotFoundException caught: The class " + e.getMessage() + " was not found.");
        }
    }
}
