package JavaProgrammingWithJDBC;

import java.sql.*;
public class ResultSetMetaDataDemo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);

            // Execute SELECT query
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

            // Get ResultSetMetaData
            ResultSetMetaData rsmd = rs.getMetaData();

            // Column count
            int columnCount = rsmd.getColumnCount();
            System.out.println("Total Columns : " + columnCount);
            System.out.println("--------------------------------");

            // Column names and types
            for (int i = 1; i <= columnCount; i++) {
                System.out.println("Column " + i);
                System.out.println("Name : " + rsmd.getColumnName(i));
                System.out.println("Type : " + rsmd.getColumnTypeName(i));
                System.out.println("--------------------------------");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
