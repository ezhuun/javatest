package day14;

import java.io.*;

public class FileWriterDemo {

	public static void main(String[] args) {
		String source = "JAVA\n" + "JSP\n" + "EJB\n" + "OJT\n" + "������\n";
		String fname = "";

		try {
			System.out.print("������ ���ϸ��� �Է��ϼ��� : ");
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			fname = in.readLine();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		try {
			FileWriter fw = new FileWriter(fname);
			fw.write(source);
			fw.close();
			System.out.println("������ �����߽��ϴ�");

			FileReader fr = new FileReader(fname);
			int i;
			System.out.println("������ �о�ɴϴ�");
			
			while ((i = fr.read()) != -1) {
				System.out.println(i);
			}
			fr.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
