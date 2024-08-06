package AccessModifiers;

public class Demo1 {
	private int number = 22;
    private String  name  = "Rahulkumar";
    private  void dispalymessage() {
    	System.out.println(" It is a private method...");
		
	}
     public void dispalyvalues() {
    	 System.out.println("The age  is : "+ number);
    	 System.out.println(" person name : "+ name);
		
	}
     public void callprivatemethod() {
    	 dispalyvalues();
		
	}
     public static void main(String[] args) {
 		Demo1 Demo = new Subclass();
 		Demo.dispalymessage();
 		Demo.callprivatemethod();
 		
 	}

 }

