package Constructors03;

public class main {
	public static void main(String[] args) {
		Demo  demo = new Demo();
		demo.display();
		Demo  demo1 = new Demo(10);
		demo1.display();
		Demo  demo2 = new Demo(22,"rahulkumar");
		demo2.display();
		Demo  demo3 = new Demo(22,"rahulkumar",5353.00);
	   demo3.display();
	}

}
