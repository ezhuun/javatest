package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDB {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=utf8";
		Connection con = null;
		Statement stmt = null;

		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 불러오기 실패");
		}

		try {
			con = DriverManager.getConnection(url, "javauser", "1234");
			stmt = con.createStatement();

			String sql = " delete from address where addressnum=4 ";
			int ret = stmt.executeUpdate(sql);
			System.out.println("레코드 " + ret + "개가 삭제 되었습니다");
		} catch (SQLException e) {
			System.err.println("DB처리에러");
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
			}
		}
	}

}
