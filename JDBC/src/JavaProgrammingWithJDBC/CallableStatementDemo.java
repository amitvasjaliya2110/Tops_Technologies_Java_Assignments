package JavaProgrammingWithJDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class CallableStatementDemo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);

            CallableStatement cs =
                    con.prepareCall("{ call getEmployeeFullName(?, ?) }");

            // Pass IN parameter
            cs.setInt(1, 5);

            // Register OUT parameter
            cs.registerOutParameter(2, Types.VARCHAR);

            // Execute Stored Procedure
            cs.execute();

            // Retrieve OUT parameter
            String fullName = cs.getString(2);

            System.out.println("Employee Full Name: " + fullName);

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
