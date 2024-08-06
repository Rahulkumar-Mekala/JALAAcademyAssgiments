package Inheritance;

public class B extends A {
	
	int x = 30;
    int z = 40;

    void methodB1() {
        System.out.println("Method B1 of class B");
    }

    void methodB2() {
        System.out.println("Method B2 of class B");
    }
    @Override
    public void overrideMethod() {
        System.out.println("Override method of class B");
    }
}
