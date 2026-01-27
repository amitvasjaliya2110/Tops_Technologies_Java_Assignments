package JavaProgrammingWithJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CRUDUsingStatement {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/JDBCStatement";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);

            // Create Statement
            Statement stmt = con.createStatement();

            // INSERT First Record
            String insertQuery = "INSERT INTO student (name, age) VALUES ('Ajay',22)";
            stmt.executeUpdate(insertQuery);
            System.out.println("Record Inserted");

            // INSERT Second Record
            String insertQuery1 = "INSERT INTO student (name, age) VALUES ('Vijay',23)";
            stmt.executeUpdate(insertQuery1);
            System.out.println("Record Inserted");

            // INSERT Third Record
            String insertQuery2 = "INSERT INTO student (name, age) VALUES ('sanjay',24)";
            stmt.executeUpdate(insertQuery2);
            System.out.println("Record Inserted");


            // UPDATE
            String updateQuery = "UPDATE student SET age = 25 WHERE id = 5";
            stmt.executeUpdate(updateQuery);
            System.out.println("Record Updated");

            // SELECT
            String selectQuery = "SELECT * FROM student";
            ResultSet rs = stmt.executeQuery(selectQuery);

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getInt("age")
                );
            }

            // DELETE
            String deleteQuery = "DELETE FROM student WHERE id = 5";
            stmt.executeUpdate(deleteQuery);
            System.out.println("Record Deleted");

            // Close Connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
