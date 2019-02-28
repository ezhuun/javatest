package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPrepDB {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=utf8";
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ���� �ҷ����� ����");
		}

		try {
			con = DriverManager.getConnection(url, "javauser", "1234");
			
			String sql = " insert into address(name, handphone, address) values(?, ?, ?) ";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, "������9");
			pstmt.setString(2, "999-999-9999");
			pstmt.setString(3, "��Ʈ��");

			int ret = pstmt.executeUpdate();

			System.out.println("���ڵ� " + ret + "���� �߰� �Ǿ����ϴ�");

		} catch (SQLException e) {
			System.err.println("DB����");
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
			}

		}

	}

}
