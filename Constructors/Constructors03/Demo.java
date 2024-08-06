package Constructors03;

public class Demo {
	private Integer number;
	private String name;
	private Double salary;
	
	
 Demo() {
 System.out.println(" Default constractor called..");
 number =0;
 name =null;
}
 public  Demo(Integer number) {
	 System.out.println(" Single Argument constractor called..");
	this. number =number;
	 
	}
protected Demo(Integer number, String name) {
	
	 System.out.println("Two-argument constructor called.");
	    
	this.number = number;
	this.name = name;
	
}
protected Demo(Integer number, String name,Double salary) {
	
	 System.out.println("Two-argument constructor called.");
	    
	this.number = number;
	this.name = name;
	this.salary= salary;
	
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
@Override
public String toString() {
	return "Demo [number=" + number + ", name=" + name + "]";
}


}
