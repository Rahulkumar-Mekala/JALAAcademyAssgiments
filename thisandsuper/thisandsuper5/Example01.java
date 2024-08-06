package thisandsuper5;

public class Example01 {
	private  Integer number;
	private String name;
	public Example01(Integer number, String name) {
		super();
		this.number = number;
		this.name = name;
		System.out.println("Parent constructor called");
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
