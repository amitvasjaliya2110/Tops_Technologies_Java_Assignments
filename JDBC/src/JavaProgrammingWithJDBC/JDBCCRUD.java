package JavaProgrammingWithJDBC;

import java.sql.*;
import java.util.Scanner;

public class JDBCCRUD {

    static int empId;
    static String fname, lname, email;
    static double salary;

    // Create Database Connection
    public static Connection create_connection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employee",
                    "root",
                    ""
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    // INSERT Employee
    public static void insertEmployee() throws SQLException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        fname = sc.next();

        System.out.print("Enter Last Name: ");
        lname = sc.next();

        System.out.print("Enter Email: ");
        email = sc.next();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();

        Connection conn = create_connection();
        String sql = "INSERT INTO employee (fname,lname,email,salary) VALUES (?,?,?,?)";

        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, fname);
        pst.setString(2, lname);
        pst.setString(3, email);
        pst.setDouble(4, salary);

        pst.executeUpdate();
        System.out.println("Employee Record Inserted Successfully");
    }

    // SELECT Employee by ID
    public static void searchEmployee() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();

        Connection conn = create_connection();
        String sql = "SELECT * FROM employee WHERE empId=?";

        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, empId);

        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            System.out.println("First Name : " + rs.getString("fname"));
            System.out.println("Last Name  : " + rs.getString("lname"));
            System.out.println("Email      : " + rs.getString("email"));
            System.out.println("Salary     : " + rs.getDouble("salary"));
        } else {
            System.out.println("Employee ID Not Found");
        }
    }

    // UPDATE Employee (Specific fields)
    public static void updateEmployee() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();

        Connection conn = create_connection();
        String checkSQL = "SELECT * FROM employee WHERE empId=?";
        PreparedStatement checkPst = conn.prepareStatement(checkSQL);
        checkPst.setInt(1, empId);

        ResultSet rs = checkPst.executeQuery();
        if (rs.next()) {

            System.out.print("Enter New First Name: ");
            fname = sc.next();

            System.out.print("Enter New Last Name: ");
            lname = sc.next();

            System.out.print("Enter New Email: ");
            email = sc.next();

            System.out.print("Enter New Salary: ");
            salary = sc.nextDouble();

            String updateSQL =
                    "UPDATE employee SET fname=?, lname=?, email=?, salary=? WHERE empId=?";

            PreparedStatement pst = conn.prepareStatement(updateSQL);
            pst.setString(1, fname);
            pst.setString(2, lname);
            pst.setString(3, email);
            pst.setDouble(4, salary);
            pst.setInt(5, empId);

            pst.executeUpdate();
            System.out.println("Employee Record Updated Successfully");

        } else {
            System.out.println("Employee ID Not Found");
        }
    }

    // DELETE Employee
    public static void deleteEmployee() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();

        Connection conn = create_connection();
        String sql = "DELETE FROM employee WHERE empId=?";

        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, empId);

        int rows = pst.executeUpdate();
        if (rows > 0) {
            System.out.println("Employee Record Deleted Successfully");
        } else {
            System.out.println("Employee ID Not Found");
        }
    }

    // MAIN MENU
    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n======================================");
            System.out.println("1. Insert Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.println("======================================");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    insertEmployee();
                    break;
                case 2:
                    searchEmployee();
                    break;
                case 3:
                    updateEmployee();
                    break;
                case 4:
                    deleteEmployee();
                    break;
                case 5:
                    System.out.println("Thank you for using the system");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        } while (true);
    }
}
