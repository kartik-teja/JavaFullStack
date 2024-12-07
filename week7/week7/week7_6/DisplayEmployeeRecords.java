package week7_6;
import java.sql.*;

public class DisplayEmployeeRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:XE"; 
        String username = "system"; 
        String password = "password"; 
		Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 connection = DriverManager.getConnection(jdbcUrl, username, password);
			 statement = connection.createStatement();
			 resultSet = statement.executeQuery("SELECT * FROM emp WHERE sal BETWEEN 1000 AND 2000");
			 ResultSetMetaData metaData = resultSet.getMetaData();
	         int columnCount = metaData.getColumnCount();
	         for (int i = 1; i <= columnCount; i++) {
	                System.out.print(metaData.getColumnName(i)+" | ");
	            }
	         System.out.println();
			 while(resultSet.next()) {
				 for (int i = 1; i <= columnCount; i++) {
	                    System.out.print(resultSet.getString(i) + " | ");
	                }
	                System.out.println();
			 }
			 
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			 try {
	                if (resultSet != null) resultSet.close();
	                if (statement != null) statement.close();
	                if (connection != null) connection.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
		}
	}

}
