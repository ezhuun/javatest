package coding.day10;

import java.io.*;

public class DevWriter {

	public static void main(String[] args) {
		String fileName = "dev.txt";

		try {
			FileWriter fw = new FileWriter(fileName, false); //��������+���λ����ѳ����� ��������
			PrintWriter pw = new PrintWriter(fw);

			pw.println("�մ���,90,95,60,75");
			pw.println("�Ʒι�,100,90,65,90");
			pw.println("���浿,90,100,80,85");
			pw.println("���浿,65,80,85,95");
			pw.println("ȫ�浿,90,95,75,100");
			pw.flush();
			pw.close();
			fw.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}