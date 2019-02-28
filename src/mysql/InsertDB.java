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
			//����̹��ε�
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			con = DriverManager.getConnection(url, "javauser", "1234");
			stmt = con.createStatement();

			String sql = "insert into address(name, handphone, address)";
			sql = sql + "values('������7','777-777-7777','�ѱ�')";

			int ret = stmt.executeUpdate(sql);
			System.out.println("���ڵ� " + ret + " ����  �߰��Ǿ����ϴ�");
		} catch (SQLException e) {
			System.err.println("db���ӿ��� : " + e.toString());
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
