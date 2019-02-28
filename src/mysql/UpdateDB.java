package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDB {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=utf8";
		Connection con = null; //���ᰴü
		Statement stmt = null; //���۰�ü

		try {
			Class.forName("org.gjt.mm.mysql.Driver"); //Ŭ���� �ҷ��ͼ� ��ü�� ���� �޸𸮿� ���
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ���� �ҷ����� ����");
		}

		try {
			con = DriverManager.getConnection(url, "javauser", "1234");
			stmt = con.createStatement();

			String	sql = " update address set handphone='777-777-7777', ";
					sql = sql + " address='ĳ���� ' where addressnum='3' ";

			int ret = stmt.executeUpdate(sql);
			System.out.println("���ڵ� " + ret + "���� �����Ǿ����ϴ�");
		} catch (SQLException e) {
			System.out.println("dbó������");
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
