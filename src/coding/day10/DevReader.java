package coding.day10;

import java.io.*;

public class DevReader {
	public static void main(String[] args) {
		String fileName = "dev_output.txt";

		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);

			String line = "";

			while (true) {
				line = br.readLine();

				if (line == null) {
					break;
				}
				System.out.println(line);
			}

			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
