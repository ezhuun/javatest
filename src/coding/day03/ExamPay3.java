package coding.day03;

import java.util.Scanner;

public class ExamPay3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// ------------------------------------------
		// 입력
		// ------------------------------------------
		System.out.print("경력 년수를 입력하세요: ");
		int year = in.nextInt();
		System.out.print("자녀수를 입력하세요: ");
		int child = in.nextInt();
		System.out.print("자격증 선택(0-없음, 1-기능사, 2-산업기사, 3-기사): ");
		int license = in.nextInt();

		// ------------------------------------------
		// 처리
		// ------------------------------------------
		int year_pay = year * 200000;
		int child_pay = child * 200000;
		int basic = 1600000;
		int license_pay = 0;
		String license_name = "";
		
		switch (license) {
		case 0:
			license_name = "없음";
			license_pay = 0;
			break;
		case 1:
			license_name = "기능사";
			license_pay = 100000;
			break;
		case 2:
			license_name = "산업기사";
			license_pay = 150000;
			break;
		case 3:
			license_name = "기사";
			license_pay = 200000;
			break;
		default:
			license_name = "확인불가";
			license_pay = 0;
			break;
		}

		int decide_pay = basic + year_pay + child_pay + license_pay; // 결정된 급여
		int annual_salary = decide_pay * 13; // 연봉

		// ------------------------------------------
		// 출력
		// ------------------------------------------
		System.out.println();
		System.out.println("-----------------------");
		System.out.println("JAVA 개발자 급여 내역서");
		System.out.println("-----------------------");
		System.out.println("기본급		: " + basic);
		System.out.println("경력 년수	: " + year);
		System.out.println("경력 수당	: " + year_pay);
		System.out.println("자녀수		: " + child);
		System.out.println("자녀 수당	: " + child_pay);
		System.out.println("자격증 이름	: " + license_name);
		System.out.println("자격증 수당	: " + license_pay);
		System.out.println("결정된 급여	: " + decide_pay);
		System.out.println("결정된 연봉	: " + annual_salary);
		System.out.println("-----------------------");
	}

}
