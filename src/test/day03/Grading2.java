package test.day03;

import java.util.Scanner;

public class Grading2 {
	public static void main(String[] args) {
		char grade;
		Scanner a = new Scanner(System.in); // Ű���� �Է°�
		while (a.hasNext()) {
			int score = a.nextInt();
			switch (score / 10) {
			case 10: // score = 100
			case 9: // 90 <= score < 100
				grade = 'A';
				break;
			case 8: // 80 <= score <= 89
				grade = 'B';
				break;
			case 7: // 70 <= score <= 79
				grade = 'C';
				break;
			case 6: // 60 <= score <= 69
				grade = 'D';
				break;
			default: // score <= 59
				grade = 'F';
			}
			System.out.println("������ " + grade + "�Դϴ�");
		}
	}
}