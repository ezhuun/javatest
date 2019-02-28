package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDBOne {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=utf8";
		Connection con = null; // ���ᰴü
		Statement stmt = null; // ���۰�ü(sql)
		ResultSet rs = null; // dql�� ������� ���� ��ü
		String num = " 1 or 'a'='a' ";
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException e) {
			System.err.println("Ŭ���� �ҷ����� ����");
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

				System.out.println("��ȣ : " + addressnum);
				System.out.println("���� : " + name);
				System.out.println("��ȭ��ȣ : " + handphone);
				System.out.println("�ּ� : " + address);
			}
		} catch (SQLException e) {
			System.err.println("DB����");
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
