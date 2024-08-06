package Static;

public class ExampleClass {
	 static int staticVar1 = 10;
	    static String staticVar2 = "Static Variable";

	    int instanceVar1;
	    String instanceVar2;

	    public static void staticMethod1() {
	        System.out.println("This is static method 1");
	    }

	    public static void staticMethod2() {
	        System.out.println("This is static method 2");
	    }
	    
	    public void instanceMethod1() {
	        System.out.println("This is instance method 1");
	    }

	    public void instanceMethod2() {
	        System.out.println("This is instance method 2");
	    }
	    public static void main(String[] args) {
	        
	        staticMethod1();
	        staticMethod2();

	       
	        ExampleClass example = new ExampleClass();
	        
	        
	        example.instanceVar1 = 20;
	        example.instanceVar2 = "Instance Variable";
	      
	        example.instanceMethod1();
	        example.instanceMethod2();
	        
	  
	        System.out.println("Static Variable 1: " + staticVar1);
	        System.out.println("Static Variable 2: " + staticVar2);
	        
	     
	        System.out.println("Instance Variable 1: " + example.instanceVar1);
	        System.out.println("Instance Variable 2: " + example.instanceVar2);
	    }
	}

