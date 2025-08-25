package day3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class updatedeletesqlcmd {

	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new OracleDriver());
		String url = "jdbc:oracle:thin:@10.33.56.49:1521:xe";
		Connection  conn = DriverManager.getConnection(url,"mohan","0987654321");
		System.out.println("conncted");
		String editqry = "update student set stdname=? , sub2=? where regno=?";
		PreparedStatement pst = conn.prepareStatement(editqry);
		pst.setString(1, "mikey");
		pst.setInt(2, 40);
		pst.setInt(3, 102);
		int rows = pst.executeUpdate();
		if(rows>0)
			System.out.println("updated row "+rows);
		else 
			System.out.println("rows not updated " + rows);
		String delqry = "delete from student where regno =?";
		pst = conn.prepareStatement(delqry);
		pst.setInt(1, 101);
		rows = pst.executeUpdate();
		if(rows>0)
			System.out.println("deleted row "+rows);
		else 
			System.out.println("rows not deleted " + rows);

	}

}
