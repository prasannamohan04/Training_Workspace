package day3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import oracle.jdbc.driver.OracleDriver;

public class test {

	public static void main(String[] args) throws SQLException{
		DriverManager.registerDriver(new OracleDriver());
		String url = "jdbc:oracle:thin:@10.33.56.49:1521:xe";
		Connection  conn = DriverManager.getConnection(url,"mohan","0987654321");
		System.out.println("conncted");
		String qry = "insert into employee values(?,?)";
		PreparedStatement pst = conn.prepareStatement(qry);
		pst.setInt(1, 102);
		pst.setString(2, "mohan");
		int rows = pst.executeUpdate();
		System.out.println("inserted " + rows);
		conn.close();

	}

}