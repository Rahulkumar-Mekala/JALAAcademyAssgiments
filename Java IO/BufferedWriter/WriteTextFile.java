package BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
	public static void main(String[] args) {
		String fileName = "output.txt";
        String textToWrite = "Hello, this is a sample text written to the file.";

try(BufferedWriter outputStream = new BufferedWriter(new FileWriter(fileName))) {
	outputStream.write(textToWrite);
	
 System.out.println("Text has been written to the file successfully.");
} catch (IOException e) {
    System.out.println("An error occurred while writing to the file.");
    e.printStackTrace();
}
}
}
