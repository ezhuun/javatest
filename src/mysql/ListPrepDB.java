package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListPrepDB {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=utf8";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� Ŭ���� �ҷ����� ����");
		}

		try {
			con = DriverManager.getConnection(url, "javauser", "1234");

			String sql = " select * from address order by addressnum desc ";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.println("��ȣ : " + rs.getInt("addressnum"));
				System.out.println("�̸� : " + rs.getString("name"));
				System.out.println("����ó : " + rs.getString("handphone"));
				System.out.println("���� : " + rs.getString("address"));
				System.out.println("=================");
			}
		} catch (SQLException e) {
			System.out.println("DBó������");
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
			}

		}

	}

}
