/* In the just concluded exercise, where you have established the connection successfully,
 exclude the registration process(by commenting the line containing the code Class.forName(“..”)). Observe the result. */

 /*Write a java program that establishes a connection to oracle database successfully.
 If the connection is successful, it should display a message “Connection Established successfully”.
 In case, it is not able to do so due to any exception, it should display the message “Connection could  not be established “. 
 If there is an exception, it should also display the description of the exception.*/



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class OracleJdbcExample {

    public static void main(String args[]) throws SQLException {
        //URL of Oracle database server
        String url = "jdbc:oracle:thin:@localhost:1521/orcl"; 
        
    /*register the driver
	try {
  	 Class.forName("oracle.jdbc.driver.OracleDriver");
	}
	catch(ClassNotFoundException ex) {
   		System.out.println("Error: unable to load driver class!");
   		System.exit(1);
	}*/
      
      
        //creating connection to Oracle database using JDBC
        try{
            Connection conn = DriverManager.getConnection(url,"hr", "hr");
            System.out.println("Connection Established successfully.");
        }
        catch(Exception e){
            System.out.println("Connection could  not be established");
            System.out.println(e);
        }

      
    }
}