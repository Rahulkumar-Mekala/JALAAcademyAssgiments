package IOExceptionDemo;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo {
    public static void main(String[] args) {
        try {
              FileWriter fileWriter = new FileWriter("examplefile.txt");
            
               fileWriter.write("Hello, world!");
            
               fileWriter.close();
          
        } catch (IOException e) {
              System.out.println("IOException caught: " + e.getMessage());
        }
    }
}
