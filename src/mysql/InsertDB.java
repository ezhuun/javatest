package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDB {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=utf8";
		Connection con = null;
		Statement stmt = null;

		try {
			//드라이버로드
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			con = DriverManager.getConnection(url, "javauser", "1234");
			stmt = con.createStatement();

			String sql = "insert into address(name, handphone, address)";
			sql = sql + "values('개발자7','777-777-7777','한국')";

			int ret = stmt.executeUpdate(sql);
			System.out.println("레코드 " + ret + " 개가  추가되었습니다");
		} catch (SQLException e) {
			System.err.println("db접속오류 : " + e.toString());
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
			}
		}
	}

}
