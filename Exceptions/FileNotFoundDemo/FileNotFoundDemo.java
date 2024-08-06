package FileNotFoundDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundDemo {
	public static void main(String[] args) {
		try {
		FileInputStream fileInputStream = new FileInputStream("nonexistentfile.txt");
		System.out.println("File opened successfully.");
        fileInputStream.close();
    } catch (FileNotFoundException e) {
           System.err.println("File Not Found Exception caught: " + e.getMessage());
    } catch (Exception e) {
      
        System.out.println("An unexpected exception occurred: " + e.getMessage());
    }
 }
	

	}

