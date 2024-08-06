package Static;

public class instancemethodsinstaticmethods {
	public void instancemethods() {
		 System.out.println(" Good Morning :");
		  System.out.println("instances method... ");
		
	}
	public static  void staticmethod() {
		 System.out.println(" Good Morning :");
		  System.out.println(" static method.. ");
		  instancemethodsinstaticmethods instancemethodsinstaticmethods= new instancemethodsinstaticmethods();
			instancemethodsinstaticmethods.instancemethods();
		
	}
	public static void main(String[] args) {
		
		staticmethod();
	}

}
