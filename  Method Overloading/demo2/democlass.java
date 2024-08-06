package demo2;

public class democlass {
	public void name( int number, String name) {
		System.out.println(" the Student id :"+number);
		System.out.println(" the Student name :"+name);

	}
  public void name( double salary, int number) {
	  System.out.println(" the Student id :"+number);
		System.out.println(" the Student salary :"+salary);
	
	}
  public static void main(String[] args) {
	democlass democlass = new democlass();
	democlass.name(21, "raj");
	democlass.name(32454.00, 22);
}
}
