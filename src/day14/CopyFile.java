package day14;

import java.io.*;

public class CopyFile {
	public static void main(String[] args) {
		try {
			if (args.length != 2) {
				System.out.println("------------�����߻�------------");
				System.out.println("usage:java CopyFile <�������ϸ�> <������ϸ�>");
				System.exit(1);
			}

			File inputFile = new File(args[0]);
			File outputFile = new File(args[1]);

			FileReader in = new FileReader(inputFile);
			FileWriter out = new FileWriter(outputFile);

			int c;

			while ((c = in.read()) != -1) {
				out.write(c);
			}
			System.out.println("���� ���簡 �Ϸ�Ǿ����ϴ�");
			in.close();
			out.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
