package AccessModifierspublic;

public class main {
 public static void main(String[] args) {
	DEFAULT default1 = new DEFAULT();
	System.out.println(" Student Details: ");
	System.out.println(" the Student number : "+default1.number);
	System.out.println(" the Student name : "+ default1.name);
	System.out.println(" the method is calling");
	default1.displayInfo();
}
}
