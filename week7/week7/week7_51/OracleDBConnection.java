package week7_51;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class OracleDBConnection {

    public static void main(String[] args) {
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "java", "java");
            
            if (con != null ) {
                System.out.println("Connection Established successfully");
            } else {
                System.out.println("Connection could not be established");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Oracle JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed! Check output console");
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}