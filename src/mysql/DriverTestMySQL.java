package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverTestMySQL {

	public static void main(String[] args) {
		Connection con = null;

		try {
			// JDBC 드라이버 로딩
			Class.forName("org.gjt.mm.mysql.Driver");

			// MYSQL서버 설정
			con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/javadb?useUnicode=true&characterEncoding=utf8", "javauser", "1234");
			System.out.println("데이터베이스 접속이 성공했습니다");

		} catch (SQLException e) {
			System.out.println("SQLException:" + e);
		} catch (Exception e) {
			System.out.println("Exception:" + e);
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
