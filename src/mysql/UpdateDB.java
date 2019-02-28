package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDB {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=utf8";
		Connection con = null; //연결객체
		Statement stmt = null; //전송객체

		try {
			Class.forName("org.gjt.mm.mysql.Driver"); //클래스 불러와서 객체를 직접 메모리에 등록
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 불러오기 실패");
		}

		try {
			con = DriverManager.getConnection(url, "javauser", "1234");
			stmt = con.createStatement();

			String	sql = " update address set handphone='777-777-7777', ";
					sql = sql + " address='캐나다 ' where addressnum='3' ";

			int ret = stmt.executeUpdate(sql);
			System.out.println("레코드 " + ret + "개가 수정되었습니다");
		} catch (SQLException e) {
			System.out.println("db처리실패");
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
