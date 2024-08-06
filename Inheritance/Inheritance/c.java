package Inheritance;

public class c extends B {
	int x = 50;
    int w = 60;

    public void methodC1() {
        System.out.println("Method C1 of class C");
    }

   public void methodC2() {
        System.out.println("Method C2 of class C");
    }

    @Override
    public void overrideMethod() {
        System.out.println("Override method of class C");
    }	 
}

