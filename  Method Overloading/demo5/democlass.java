package demo5;

public class democlass {
	public void name( int number, String name) {
		System.out.println(" the Student id :"+number);
		System.out.println(" the Student name :"+name);

	}
  public void name( String name, int number) {
	  System.out.println(" the Student salary :"+number);
		System.out.println(" the Student name :"+name);
	
	}
  public static void main(String[] args) {
	democlass democlass = new democlass();
	democlass.name(21, "raj");
	democlass.name("rahesh", 22);
}
}
