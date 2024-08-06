package JAVABasics;



public class Assigment5 {
	   String var = "I am a global variable";

	    public void printVariables() {
	       
	        String var = "I am a local variable";
	        System.out.println("Inside the method: " + var);
	    }

	    public static void main(String[] args) {
	       
	        Assigment5 example = new Assigment5();

	        System.out.println("Outside the method: " + example.var);

	     
	        example.printVariables();

	       
	        System.out.println("Outside the method again: " + example.var);
	    }
	}  
	

