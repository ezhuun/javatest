package coding.day10;

import java.io.*;

public class Dev {

	public static void main(String[] args) {
		String filePath = "dev.txt";
		try {
			filePrint(filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void filePrint(String path) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(path));
		String temp = "";
		StringBuffer str = new StringBuffer();
		while ((temp = br.readLine()) != null) {
			str.append(temp + "\n");
		}
		br.close();
		System.out.println(str.toString());
	}

}
