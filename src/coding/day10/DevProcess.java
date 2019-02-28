package coding.day10;

import java.io.*;
import java.util.*;

public class DevProcess {

	public static void main(String[] args) {
		String fileName = "dev.txt";
		String fileNameOutput = "dev_output.txt";

		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter(fileNameOutput, false); //이어쓰기
			PrintWriter pw = new PrintWriter(fw); // 편의상 println을 쓰기위해서

			String line = "";

			pw.println("	2017년 신입사원 평가 점수 ");
			pw.println("");
			pw.println("평가일: " + new Date().toLocaleString());
			pw.println("----------------------------------------------------");
			pw.println("성 명\tJAVA\tJSP\tSPRING\tPROJECT\tTOT\tAVG");
			pw.println("----------------------------------------------------");
			
			while (true) {
				line = br.readLine();

				if (line == null) {
					break;
				}
				String[] str = line.split(",");
				String name = str[0];
				int java = Integer.parseInt(str[1]);
				int jsp = Integer.parseInt(str[2]);
				int spring = Integer.parseInt(str[3]);
				int project = Integer.parseInt(str[4]);

				int tot = java + jsp + spring + project;
				int avg = tot / 4;
				pw.println(name + "\t" + java + "\t" + jsp + "\t" + spring + "\t" + project + "\t" + tot + "\t" + avg);
				pw.println("----------------------------------------------------");
			}
			pw.println("	SOLDESK IT Academy 2017	");

			br.close();
			fr.close();

			pw.flush();
			pw.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
