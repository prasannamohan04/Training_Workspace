package day3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class getdata {
	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new OracleDriver());
		String url = "jdbc:oracle:thin:@10.33.56.49:1521:xe";
		Connection  conn = DriverManager.getConnection(url,"mohan","0987654321");
		System.out.println("conncted");
		
		String qry = "select* from student";
		PreparedStatement pst  = conn.prepareStatement(qry);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+ rs.getString("stdname")+" "+ rs.getInt(3)+" "+ rs.getInt(4)+" "+rs.getDate(5));
			
		}
	}

}
