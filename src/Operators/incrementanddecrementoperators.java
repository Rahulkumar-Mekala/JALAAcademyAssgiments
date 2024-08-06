package Operators;

public class incrementanddecrementoperators {
			
	
	public void increment() {
		 int a= 25;
		 System.out.println(" The value of a  before increment : " +a);
		 a++;
		 
		 System.out.println(" The value of a  after increment : " +a);
		 System.out.println("=====================");
		 int b= 30;
		 System.out.println(" The value of b  before decrement : " +b);
		 b--;
		 System.out.println(" The value of b  after decrement : " +b);
			
		
	}
public static void main(String[] args) {
	incrementanddecrementoperators incrementanddecrementoperators = new incrementanddecrementoperators();
	incrementanddecrementoperators.increment();
}
}
