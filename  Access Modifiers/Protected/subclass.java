package Protected;

public class subclass extends protectedacess {
	 protected void subdisplayInfo() {
		  System.out.println("it is calling variable :");
	        System.out.println("Student Number: " + number);
	        System.out.println("Student Text: " + name);
	        System.out.println(" it is calling method..");
	        displayInfo();
	        
	 }
public static void main(String[] args) {
	subclass subclass = new subclass();
	subclass.subdisplayInfo();
}
	 
}
