package Static;

public class ExampleClass3 {

	    static int staticVar1 = 10;
	    static String staticVar2 = "Static Variable";

	  
	  
	   
	    public void instanceMethod1() {
	        System.out.println("This is instance method 1");
	  
	        System.out.println("Static Variable 1: " +ExampleClass3. staticVar1);
	        System.out.println("Static Variable 2: " +ExampleClass3. staticVar2);
	    }

	   
	    public static void main(String[] args) {
	      
       ExampleClass example = new ExampleClass();
       example.instanceMethod1();
       System.out.println(staticVar1 );
       System.out.println(staticVar2 );
     
      
	        
	     
	        
	       
	    }
	}


