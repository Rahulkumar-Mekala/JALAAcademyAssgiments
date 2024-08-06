package BufferedReaderExample.copy;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class BufferedReaderExample {
	 public static void main(String[] args) {
		 
		 String name="inputtextfile.txt";
		 try (BufferedReader inputStream = new BufferedReader( new FileReader(name))){
			 int content;
			 while ((content = inputStream.read()) != -1) {
			   System.out.println(content);
				
			}
			
		} catch (IOException e) {
            System.err.println("An error occurred while reading the file."+e.getMessage());
            
        }
	}

}
