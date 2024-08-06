package PropertiesFileReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFileReader {
	 public static void main(String[] args) {
	        Properties properties = new Properties();
	        String filePath = "config.properties";
	        try(InputStream inputStream = new FileInputStream(filePath)){
	        	properties.load(inputStream);
	        	
	        	String dbUser = properties.getProperty("db.user");
	            String dbPassword = properties.getProperty("db.password");
	            String dbUrl = properties.getProperty("db.url");
	            System.out.println("Database User: " + dbUser);
	            System.out.println("Database Password: " + dbPassword);
	            System.out.println("Database URL: " + dbUrl);
	        	
				
			} catch (IOException e) {
			e.printStackTrace();
			}


	 }
}
