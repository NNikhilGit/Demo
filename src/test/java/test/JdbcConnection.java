package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {

	public static void main(String[] args) throws SQLException {
		
		Connection con = null;

		try {
			
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://cawtest02.clickawaiter.com:3306/caw1", "clickawaiter", "Clickawaiter");
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from users");
			
			while (rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}

		} catch ( ArithmeticException  e){
			System.out.println(e);
		} catch (Exception e) {
			
			System.out.println(e);
			
		} finally {
			
			con.close();
			
		}
	}
}