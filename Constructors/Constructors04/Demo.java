package Constructors04;

public class Demo {
	private Integer number;
	private String name;
	

public Demo(Integer number, String name) {
	super();
	 System.out.println("Two-argument constructor called.");
	    
	this.number = number;
	this.name = name;
	
}

public Integer number() {
	return number;
	
}
public String name() {
	return name;
	
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
