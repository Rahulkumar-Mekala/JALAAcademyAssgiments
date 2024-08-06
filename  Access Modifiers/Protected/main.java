package Protected;

public class main {
 public static void main(String[] args) {
	protectedacess protectedacess = new protectedacess();
	System.out.println(" Student Details: ");
	System.out.println(" the Student number : "+protectedacess.number);
	System.out.println(" the Student name : "+ protectedacess.name);
	System.out.println(" the method is calling");
	protectedacess.displayInfo();
}
}
