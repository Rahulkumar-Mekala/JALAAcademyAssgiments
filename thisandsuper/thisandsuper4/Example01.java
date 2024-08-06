package thisandsuper4;

public class Example01 {
	private  Integer number;
	private String name;
	
	public Example01(Integer number) {
		this(number,"Defauttext");
		System.out.println(" Single Argument Constractor : ");
	
	}
	
	
	public Example01(Integer number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

 	

	@Override
	public String toString() {
		return "Example01 [number=" + number + ", name=" + name + "]";
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


	public void display() {
		 System.out.println(" the Number : "+ number);
		 System.out.println(" the name : " + name);
		
	}
	
	 public static void main(String[] args) {
		 
		 Example01 example = new Example01(23);
		 System.out.println(example);
		Example01 example01 = new Example01(22,"rahul");
		example01.display();
		
	}

}
