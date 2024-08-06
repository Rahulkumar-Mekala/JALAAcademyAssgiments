package Supercalss;

public class superclass {
	private Integer number;
	private String name;
	public superclass() {
	
	
	System.out.println(" Default constractor called..");
	 number =0;
	 name =null;
	}

	public superclass(Integer number) {
		 System.out.println(" Single Argument constractor called..");
		number =number;
		 
		}
	public superclass(Integer number, String name) {
	
		 System.out.println("Two-argument constructor called.");
		    
		this.number = number;
		this.name = name;
	}
	public void display() {
	    System.out.println("number: " + number + ", name: " + name);
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
