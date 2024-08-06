package Loops;

public class EqualityOperators {
    public static void main(String[] args) {
      
        int a = 10;
        int b = 20;
        int c = 10;
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello";

        System.out.println("Using == operator:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a == c: " + (a == c)); 
        System.out.println("str1 == str2: " + (str1 == str2)); 
        System.out.println("str1 == str3: " + (str1 == str3)); 

       
        System.out.println("Using != operator:");
        System.out.println("a != b: " + (a != b)); 
        System.out.println("a != c: " + (a != c)); 
        System.out.println("str1 != str2: " + (str1 != str2)); 
        System.out.println("str1 != str3: " + (str1 != str3)); 
    }
}

