package demo1;

public class democlass {
	public void name( int number) {
		System.out.println(" the Student id :"+number);
		

	}
  public void name( String name) {

		System.out.println(" the Student name :"+name);
	
	}
  public static void main(String[] args) {
	democlass democlass = new democlass();
	democlass.name(21);
	democlass.name("ramesh");
}
}
