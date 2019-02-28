package day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex3 {
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		String url = "";
		String user = "";
		String password = "";
		
		con = DriverManager.getConnection(url, user, password);
	}
}
