package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDBOne {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=utf8";
		Connection con = null; // 연결객체
		Statement stmt = null; // 전송객체(sql)
		ResultSet rs = null; // dql의 결과값을 받을 객체
		String num = " 1 or 'a'='a' ";
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException e) {
			System.err.println("클래스 불러오기 실패");
		}

		try {
			con = DriverManager.getConnection(url, "javauser", "1234");
			stmt = con.createStatement();

			String sql = "select * from address where addressnum="+num;
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int addressnum = rs.getInt(1);
				String name = rs.getString(2);
				String handphone = rs.getString("handphone");
				String address = rs.getString("address");

				System.out.println("번호 : " + addressnum);
				System.out.println("성명 : " + name);
				System.out.println("전화번호 : " + handphone);
				System.out.println("주소 : " + address);
			}
		} catch (SQLException e) {
			System.err.println("DB에러");
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				}

			} catch (Exception e) {
			}
		}

	}

}
