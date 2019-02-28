package day14;

import java.io.*;

public class ReadAndWriteFromFile {
	// =============================
	// main()
	// 1. ���ǵ� ������ �Ű����ڷ� �Ͽ� �ý��ۿ��� �Է¹��� ������ �����ϴ� �޼ҵ� ȣ��
	// 2. ����� ������ �о���� �޼ҵ� ȣ��
	// =============================
	public static void main(String[] args) {

		String fname = "aaa.txt";
		ReadAndWriteFromFile baw = new ReadAndWriteFromFile();
		System.out.println("�Ʒ������ 999�� �Էµɶ������� ������ ����˴ϴ�");
		try {
			baw.readnwrite(fname, false); 
			baw.readFile(fname);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// =====================================
	// void readnwrite(String fn, boolean append)
	// �ý������� �Էµ� ������ �����Ѵ�
	// =====================================
	public void readnwrite(String fn, boolean append) throws IOException {
		FileWriter fw = new FileWriter(fn, append); //���������
		PrintWriter pw = new PrintWriter(fw); //flush() default false
		String s = null;

		while (!(s = readbuff()).equals("999")) {
			//fw.write(s+"\n");
			pw.println(s);
			pw.flush();
		}
		pw.close();
		fw.close();
	}

	// =====================================
	// String readbuff()
	// �ý��� �Է��� �޴´�
	// =====================================
	public String readbuff() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		return br.readLine();
	}

	// =====================================
	// void readFile(String fn)
	// �Ű����ڷ� ���� ������ �о�´�
	// =====================================
	public void readFile(String fn) throws IOException {
		FileReader fr = new FileReader(fn);
		BufferedReader br = new BufferedReader(fr);

		StringBuffer sb = new StringBuffer();
		String temp = "";

		while ((temp = br.readLine()) != null) {
			sb.append(temp + "\n");
		}
		System.out.println(sb.toString());
		br.close();
		fr.close();
	}
}
