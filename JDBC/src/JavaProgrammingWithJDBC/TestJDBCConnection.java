package JavaProgrammingWithJDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBCConnection {
    public static void main ( String[] args ) {
        String url = "jdbc:mysql://localhost:3306/employee";
        String userName  = "root";
        String password  = "";

        try{
            //Load JDBC Driver
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("JDBC Driver Loaded Successfully....");

            //Establish Connection
            Connection connection = DriverManager.getConnection(url,userName,password);
            System.out.println("Database Connected Successfully....");

            connection.close();
            System.out.println("Connection Closed....");

        } catch (Exception e) {
            e.printStackTrace ();
        }
    }
}
