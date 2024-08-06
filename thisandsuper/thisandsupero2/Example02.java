package thisandsupero2;

public class Example02  extends Example01{

	private Double salary;

	public Example02(Integer number, String name, Double salary) {
		super(number, name);
		this.salary = salary;
	}
	public void display() {
		System.out.println(" the student number : "+super.getNumber());
		System.out.println(" the student number : "+super.getName());
		System.out.println(" the  Student fee : "+ salary);

	}
	

}
