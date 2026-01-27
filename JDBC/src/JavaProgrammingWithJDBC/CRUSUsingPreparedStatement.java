package JavaProgrammingWithJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CRUSUsingPreparedStatement {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/preparedStatement";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);

            String insertSQL = "INSERT INTO student (name, age) VALUES (?, ?)";
            PreparedStatement psInsert =
                    con.prepareStatement(insertSQL, Statement.RETURN_GENERATED_KEYS);

            psInsert.setString(1, "sanjay");
            psInsert.setInt(2, 25);
            psInsert.executeUpdate();

            psInsert.setString(1, "jay");
            psInsert.setInt(2, 35);
            psInsert.executeUpdate();

            System.out.println("Records Inserted");

            // UPDATE
            String updateSQL = "UPDATE student SET age = ? WHERE id = ?";
            PreparedStatement psUpdate = con.prepareStatement(updateSQL);
            psUpdate.setInt(1, 36);
            psUpdate.setInt(2, 4);
            psUpdate.executeUpdate();
            System.out.println("Record Updated");

            // DELETE
            String deleteSQL = "DELETE FROM student WHERE id = ?";
            PreparedStatement psDelete = con.prepareStatement(deleteSQL);
            psDelete.setInt(1, 4);
            psDelete.executeUpdate();
            System.out.println("Record Deleted");

            //SELECT
            String selectQuery = "SELECT * FROM student";
            PreparedStatement psSelect = con.prepareStatement(selectQuery);
            ResultSet rs = psSelect.executeQuery(selectQuery);

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getInt("age")
                );
            }


            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
