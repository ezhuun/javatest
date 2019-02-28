package day14;

import java.io.*;

public class FileDirDemo1 {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("디렉토리를 입력해주세요");

		String directory = "";


		try {
			directory = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		File f1 = new File(directory);
		System.out.println("검색 디렉토리 : " + directory);
		System.out.println("=============================");

		if (f1.isDirectory()) {

			String[] s = f1.list(); // 디렉토리안에잇는 파일/디렉토리목록
			for (int i = 0; i < s.length; i++) {
				File f = new File(directory + "/" + s[i]);

				if (f.isDirectory()) {

					System.out.println(s[i] + " : 디렉토리(" + f.list().length + "개)");
				} else {
					System.out.println(s[i] + " : 파일");
				}

			}
		} else {
			System.out.println("검색한 " + directory + " 는 디렉토리가 아닙니다");
		}
	}
}
