package day14;

import java.io.*;

public class ReadFromLine {
	public static void main(String[] args) {
		try {
			System.out.println("�����͸� �Է��ϼ���");
			InputStreamReader isr = new InputStreamReader(System.in);
			LineNumberReader br = new LineNumberReader(isr);
			StringBuffer sb = new StringBuffer();
			String s = "";
			while (!(s = br.readLine()).equals("999")) {
				sb.append(br.getLineNumber() + " " + s + "\n");
			}
			System.out.println(sb.toString());
			br.close();
			isr.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}
}
