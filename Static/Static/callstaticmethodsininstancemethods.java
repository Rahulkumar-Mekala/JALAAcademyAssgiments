package Static;

public class callstaticmethodsininstancemethods {
	public static void staticmethod() {
		 System.out.println(" Good Morning :");
		  System.out.println("static method... ");
		
	}
	public   void instacemethod() {
		 System.out.println(" Good Morning :");
		  System.out.println(" instance method.. ");
		 staticmethod();
		
	}
public static void main(String[] args) {
	callstaticmethodsininstancemethods callstaticmethodsininstancemethods = new callstaticmethodsininstancemethods();
	callstaticmethodsininstancemethods.instacemethod();
}
}
