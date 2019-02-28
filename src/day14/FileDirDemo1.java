package day14;

import java.io.*;

public class FileDirDemo1 {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���丮�� �Է����ּ���");

		String directory = "";


		try {
			directory = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		File f1 = new File(directory);
		System.out.println("�˻� ���丮 : " + directory);
		System.out.println("=============================");

		if (f1.isDirectory()) {

			String[] s = f1.list(); // ���丮�ȿ��մ� ����/���丮���
			for (int i = 0; i < s.length; i++) {
				File f = new File(directory + "/" + s[i]);

				if (f.isDirectory()) {

					System.out.println(s[i] + " : ���丮(" + f.list().length + "��)");
				} else {
					System.out.println(s[i] + " : ����");
				}

			}
		} else {
			System.out.println("�˻��� " + directory + " �� ���丮�� �ƴմϴ�");
		}
	}
}
