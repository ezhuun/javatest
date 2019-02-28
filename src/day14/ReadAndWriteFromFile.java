package day14;

import java.io.*;

public class ReadAndWriteFromFile {
	// =============================
	// main()
	// 1. 정의된 파일을 매개인자로 하여 시스템에서 입력받은 내용을 저장하는 메소드 호출
	// 2. 저장된 파일을 읽어오는 메소드 호출
	// =============================
	public static void main(String[] args) {

		String fname = "aaa.txt";
		ReadAndWriteFromFile baw = new ReadAndWriteFromFile();
		System.out.println("아래행부터 999가 입력될때까지의 내용이 저장됩니다");
		try {
			baw.readnwrite(fname, false); 
			baw.readFile(fname);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// =====================================
	// void readnwrite(String fn, boolean append)
	// 시스템으로 입력된 내용을 저장한다
	// =====================================
	public void readnwrite(String fn, boolean append) throws IOException {
		FileWriter fw = new FileWriter(fn, append); //덮어쓰기유무
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
	// 시스템 입력을 받는다
	// =====================================
	public String readbuff() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		return br.readLine();
	}

	// =====================================
	// void readFile(String fn)
	// 매개인자로 받은 파일을 읽어온다
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
