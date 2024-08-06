package demo4;

public class democlass {
	public void name( int number, String name) {
		System.out.println(" the Student id :"+number);
		System.out.println(" the Student name :"+name);

	}
  public void name( String name, float salary) {
	  System.out.println(" the Student salary :"+salary);
		System.out.println(" the Student name :"+name);
	
	}
  public static void main(String[] args) {
	democlass democlass = new democlass();
	democlass.name(21, "raj");
	democlass.name("rahesh", 22f);
}
}
