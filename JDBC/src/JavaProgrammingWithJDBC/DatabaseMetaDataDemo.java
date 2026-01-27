package JavaProgrammingWithJDBC;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class DatabaseMetaDataDemo {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);

            DatabaseMetaData dbmd = con.getMetaData();

            System.out.println("Database Name    : " + dbmd.getDatabaseProductName());
            System.out.println("Database Version : " + dbmd.getDatabaseProductVersion());
            System.out.println("Driver Name      : " + dbmd.getDriverName());
            System.out.println("Driver Version   : " + dbmd.getDriverVersion());
            System.out.println("JDBC Version     : " +
                    dbmd.getJDBCMajorVersion() + "." + dbmd.getJDBCMinorVersion());

            // These methods ARE supported
            System.out.println("\n--- Supported Features ---");
            System.out.println("Supports Transactions  : " + dbmd.supportsTransactions());
            System.out.println("Supports Batch Updates : " + dbmd.supportsBatchUpdates());
            System.out.println("Supports ResultSet TYPE_SCROLL_INSENSITIVE : "
                    + dbmd.supportsResultSetType( ResultSet.TYPE_SCROLL_INSENSITIVE));


            System.out.println("\n--- List of Tables ---");

            // Retrieve tables
            ResultSet rs = dbmd.getTables(
                    con.getCatalog(),  // database name
                    null,
                    "%",
                    new String[]{"TABLE"}
            );

            while (rs.next()) {
                System.out.println("Table Name : " + rs.getString("TABLE_NAME"));
                System.out.println("Table Type : " + rs.getString("TABLE_TYPE"));
                System.out.println("----------------------------------");
            }
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}