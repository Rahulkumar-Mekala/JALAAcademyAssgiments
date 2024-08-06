package fileusingOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteTextFile {
	public static void main(String[] args) {
		String fileName = "output.txt";
        String textToWrite = "Hello, this is a sample text written to the file.";

try(OutputStream outputStream = new FileOutputStream(fileName)) {
	outputStream.write(textToWrite.getBytes());
	
 System.out.println("Text has been written to the file successfully.");
} catch (IOException e) {
    System.out.println("An error occurred while writing to the file.");
    e.printStackTrace();
}
}
}
