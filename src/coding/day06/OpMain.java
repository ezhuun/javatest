package coding.day06;

import java.text.DecimalFormat;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

//메인 클래스
public class OpMain {
	public static void main(String[] args) {
		Po[] opArray = new Po[3];

		for (int i = 0; i < opArray.length; i++) {
			opArray[i] = new Po();
			opArray[i].indata(i);
		}

	}
}

// 연산 클래스
class Po {
	private int a; // 첫번째 숫자
	private int b; // 두번째 숫자
	private int c; // 연산자 번호(1:+, 2:-, 3:*, 4:/, 5:%)

	// ==================
	// 멤버변수 set 메소드
	// ------------------
	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void setC(int c) {
		this.c = c;
	}

	// ==================
	// 멤버변수 get 메소드
	// ------------------
	public int getA() {
		return this.a;
	}

	public int getB() {
		return this.b;
	}

	public int getC() {
		return this.c;
	}

	// ==================
	// Scanner 입력 메소드
	// ------------------
	public void indata(int n) {
		Scanner s = new Scanner(System.in);

		System.out.println("=========" + (n + 1) + "번째 호출=========");
		System.out.print("첫번째 숫자입력 : ");
		int tempA = s.nextInt();
		System.out.print("두번째 숫자입력 : ");
		int tempB = s.nextInt();
		System.out.print("연산자선택(1:+, 2:-, 3:*, 4:/, 5:%) : ");
		int tempC = s.nextInt();

		if (tempC > 0 && tempC <= 5) {
			this.setA(tempA);
			this.setB(tempB);
			this.setC(tempC);

			this.process();
		} else {
			System.out.println("연산자 선택 오류");
			System.out.println();
			return;
		}
	}

	// ==================
	// 연산 메소드
	// ------------------
	public void process() {
		int res = 0;
		String op = "";

		switch (this.getC()) {
		case 1:
			res = this.getA() + this.getB();
			op = "+";
			break;
		case 2:
			res = this.getA() - this.getB();
			op = "-";
			break;
		case 3:
			res = this.getA() * this.getB();
			op = "*";
			break;
		case 4:
			res = this.getA() / this.getB();
			op = "/";
			break;
		case 5:
			res = this.getA() % this.getB();
			op = "&";
			break;
		}

		this.printPo(res, op);
	}

	// ==================
	// 출력 메소드
	// ------------------
	public void printPo(int res, String op) {
		DecimalFormat comma = new DecimalFormat();

		System.out.println("결과값 : " + this.getA() + " " + op + " " + this.getB() + " = " + comma.format(res));
		System.out.println("==========================");
		System.out.println();
	}

}
