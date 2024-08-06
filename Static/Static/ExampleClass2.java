package Static;

public class ExampleClass2 {
	
	    int instanceVar1= 1;
	    String instanceVar2= "rahul";
	    public static void staticMethod1() {
	    	 ExampleClass2 exampleClass2 = new ExampleClass2();
	             System.out.println("Static Method 1:");
	        System.out.println("Instance Variable 1: "+exampleClass2.instanceVar1 );
	        System.out.println("Instance Variable 2: "+exampleClass2.instanceVar2  );
	    }
	     
	    public static void main(String[] args) {
			staticMethod1();
			     
			
		}
}         



