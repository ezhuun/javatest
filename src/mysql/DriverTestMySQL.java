package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverTestMySQL {

	public static void main(String[] args) {
		Connection con = null;

		try {
			// JDBC ����̹� �ε�
			Class.forName("org.gjt.mm.mysql.Driver");

			// MYSQL���� ����
			con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/javadb?useUnicode=true&characterEncoding=utf8", "javauser", "1234");
			System.out.println("�����ͺ��̽� ������ �����߽��ϴ�");

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
