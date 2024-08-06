package Supercalss;

public class subclass extends superclass {
	public subclass() {
        super(); 
        System.out.println("Subclass default constructor called.");
    }

    
    public subclass(Integer number) {
        super(number); 
        System.out.println("Subclass one-argument constructor called.");
    }

   
    public subclass(Integer number, String name) {
        super(number, name); 
        System.out.println("Subclass two-argument constructor called.");
    }

    public void display() {
       System.out.println(" the studet id :"+getNumber()+" :"+ " the Student name :"+getName());
    }
}


