package Inheritance;

public class main {
	 public static void main(String[] args) {
		    
	        A objA = new A();
	        System.out.println("Calling methods of class A:");
	        objA.methodA1();
	        objA.methodA2();
	        objA.overrideMethod();
	        B objB = new B();
	        System.out.println("Calling methods of class B:");
	        objB.methodB1();
	        objB.methodB2();
	        objB.overrideMethod();
	        c objC = new c();
	        System.out.println("Calling methods of class C:");
	        objC.methodC1();
	        objC.methodC2();
	        objC.overrideMethod();
	        
	        A refB = new B();
	        System.out.println("Calling overridden method with superclass reference:");
	        refB.overrideMethod(); 
	        System.out.println("refB.x: " + refB.x);
	        A refC = new c();
	        refC.overrideMethod();
	        System.out.println("Runtime Polymorphism with Data Members:");
	      
	        System.out.println("refC.x: " + refC.x);
	        System.out.println("Accessing Data Members Directly:");
	        System.out.println("objA.x: " + objA.x);
	        System.out.println("objB.x: " + objB.x);
	        System.out.println("objC.x: " + objC.x);
	}

}
