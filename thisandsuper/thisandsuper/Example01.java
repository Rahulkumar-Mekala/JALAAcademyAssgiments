package thisandsuper;

public class Example01 {
	private  Integer number;
	private String name;
	public Example01(Integer number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	public void display() {
		 System.out.println(" the Number : "+ number);
		 System.out.println(" the name : " + name);
		
	}
	 public static void main(String[] args) {
		Example01 example01 = new Example01(22, "Rahulkumar");
		example01.display();
	}

}
