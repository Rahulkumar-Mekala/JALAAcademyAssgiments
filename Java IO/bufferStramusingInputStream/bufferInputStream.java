package bufferStramusingInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class bufferInputStream {
	 public static void main(String[] args) {
		 
		 String name="inputtextfile.txt";
		 try (BufferedInputStream inputStream = new BufferedInputStream(  new FileInputStream (name))){
			 int content;
			 while ((content = inputStream.read()) != -1) {
			   System.out.println(content);
				
			}
			
		} catch (IOException e) {
            System.err.println("An error occurred while reading the file."+e.getMessage());
            
        }
	}

}
