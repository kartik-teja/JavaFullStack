
package week7_7;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertStudentRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the roll no");
		int roll = scan.nextInt();
		System.out.println("Enter the name");
		String name = scan.next();
		System.out.println("Enter the standard");
		String std = scan.next();
		System.out.println("Enter the date of birth(yyyy-mm-dd)");
		String dob = scan.next();
		System.out.println("Enter the fees");
		double fee = scan.nextDouble();
		Connection con = null;
		PreparedStatement stm = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","java","java");
			stm = con.prepareStatement("Insert into student values (?,?,?,?,?)");
			insertStudent(stm,roll,name,std,dob,fee);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			scan.close();
			try {if (stm!=null) stm.close();
				if (con!=null) con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}
	private static void insertStudent(PreparedStatement stmt,int rollno,String name
			,String standard,String dob, double fees) throws SQLException{
		stmt.setInt(1, rollno);
		stmt.setString(2,name);
		stmt.setString(3, standard);	
		stmt.setDate(4, Date.valueOf(dob));
		stmt.setDouble(5, fees);
		stmt.executeUpdate();
	}

}
