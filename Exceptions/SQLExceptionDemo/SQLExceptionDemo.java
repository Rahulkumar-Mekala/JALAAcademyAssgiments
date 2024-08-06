package SQLExceptionDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLExceptionDemo {
    public static void main(String[] args) {
        

        try {
             Class.forName("oracle.jdbc.driver.OracleDriver");
            
        Connection  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "username", "password");
            
           PreparedStatement statement = connection.prepareStatement( "SELECT * FROM nonexistent_table");
            
          statement.executeQuery(); 
        } catch (SQLException e) {
                 System.out.println("SQLException caught: " + e.getMessage());
        } catch (Exception e) {
                System.out.println("An unexpected exception occurred: " + e.getMessage());
        } finally {
               try {
                Connection statement = null;
				if (statement != null) statement.close();
                Connection connection = null;
				if (connection != null) connection.close();
            } catch (SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}
