package test.day03;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�.");
		int score= scan.nextInt();
		
		int grade = score/10;
		switch (grade) {
		case 10:
			System.out.println("100���Դϴ�.");
			break;
		case 9:
			System.out.println("����� A�Դϴ�.");
			break;
		case 8:
			System.out.println("����� B�Դϴ�.");
			break;
			
		case 7:
			System.out.println("����� C�Դϴ�.");
			break;
			
		case 6:
			System.out.println("����� D�Դϴ�.");
			break;
			
		default:
			System.out.println("����ϼ���.");
			break;
		}
	}

}
