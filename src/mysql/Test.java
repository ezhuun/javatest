package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=utf8";
		Connection con = null;
		Statement stmt = null;
		ResultSet set = null;

		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException e1) {
			System.out.println("클래스 로드 실패");
		}

		try {
			con = DriverManager.getConnection(url, "javauser", "1234");
			stmt = con.createStatement();

			String query = " select * from address ";

			set = stmt.executeQuery(query);
			while (set.next()) {
				System.out.println("이름 : " + set.getString("name"));
				System.out.println("주소 : " + set.getString("address"));
				System.out.println("------------------------");
			}

		} catch (SQLException e) {
			System.err.println("db에러");
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (set != null) {
					set.close();
				}
			} catch (Exception c) {

			}

		}

	}

}
