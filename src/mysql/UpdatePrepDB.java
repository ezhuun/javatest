package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdatePrepDB {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=utf8";
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� Ŭ���� �ҷ����� ����");
		}

		try {
			con = DriverManager.getConnection(url, "javauser", "1234");

			String sql = " update address set name=?, handphone=?, address=? where addressnum=? ";
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, "������");
			pstmt.setString(2, "111-1111-1111");
			pstmt.setString(3, "���ѹα�");
			pstmt.setInt(4, 2);

			int ret = pstmt.executeUpdate();
			System.out.println("���ڵ� " + ret + "���� ������Ʈ�Ǿ����ϴ�");

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
			} catch (SQLException e) {
			}
		}

	}

}
