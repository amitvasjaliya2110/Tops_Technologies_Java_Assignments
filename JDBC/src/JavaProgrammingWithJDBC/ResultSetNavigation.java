package JavaProgrammingWithJDBC;

import java.sql.*;
public class ResultSetNavigation {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);

            // Create Statement with scrollable ResultSet
            Statement stmt = con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY
            );

            // Execute SELECT query
            String sql = "SELECT * FROM employee";
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("---- Forward Traversal using next() ----");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("empId") + " " +
                                rs.getString("fname") + " " +
                                rs.getDouble("salary")
                );
            }

            System.out.println("\n---- Backward Traversal using previous() ----");
            while (rs.previous()) {
                System.out.println(
                        rs.getInt("empId") + " " +
                                rs.getString("fname") + " " +
                                rs.getDouble("salary")
                );
            }

            System.out.println("\n---- First Record ----");
            if (rs.first()) {
                System.out.println(
                        rs.getInt("empId") + " " +
                                rs.getString("fname") + " " +
                                rs.getDouble("salary")
                );
            }

            System.out.println("\n---- Last Record ----");
            if (rs.last()) {
                System.out.println(
                        rs.getInt("empId") + " " +
                                rs.getString("fname") + " " +
                                rs.getDouble("salary")
                );
            }

            System.out.println("\n---- Absolute Position (4th Record) ----");
            if (rs.absolute(3)) {
                System.out.println(
                        rs.getInt("empId") + " " +
                                rs.getString("fname") + " " +
                                rs.getDouble("salary")
                );
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
