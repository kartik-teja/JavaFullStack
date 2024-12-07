package week7_6;
import java.sql.*;

public class OracleDBQuery {

	public static void main(String[] args) {
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
			 String query = "Select empno, ename from emp";
			 resultSet = statement.executeQuery(query);
			 int i =2;
			 while(i>0 && resultSet.next()) {
				 System.out.println("EmpId: "+resultSet.getInt(1)+" Name: "+resultSet.getString("ename"));
				 i--;
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
