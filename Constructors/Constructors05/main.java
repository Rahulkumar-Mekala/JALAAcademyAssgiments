package Constructors05;

class main {

    
    public int getValue() {
        return 42; 
    }

    
    public String getValue(int number) {
        return "Number: " + number; 
        
    }

    
    public double getValue(String text) {
        return text.length(); 
    }
    
    public void display() {
        System.out.println("Methods are overloaded based on parameters, not return type.");
    }

    public static void main(String[] args) {
        main obj = new main();

        int intValue = obj.getValue();
        System.out.println("Int value: " + intValue);

       
        String stringValue = obj.getValue(100);
        System.out.println("String value: " + stringValue);
      double lengthValue = obj.getValue("Hello");
        System.out.println("Length value: " + lengthValue);

        obj.display();
    }
}
