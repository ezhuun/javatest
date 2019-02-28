package coding.day06;

import java.text.DecimalFormat;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

//���� Ŭ����
public class OpMain {
	public static void main(String[] args) {
		Po[] opArray = new Po[3];

		for (int i = 0; i < opArray.length; i++) {
			opArray[i] = new Po();
			opArray[i].indata(i);
		}

	}
}

// ���� Ŭ����
class Po {
	private int a; // ù��° ����
	private int b; // �ι�° ����
	private int c; // ������ ��ȣ(1:+, 2:-, 3:*, 4:/, 5:%)

	// ==================
	// ������� set �޼ҵ�
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
	// ������� get �޼ҵ�
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
	// Scanner �Է� �޼ҵ�
	// ------------------
	public void indata(int n) {
		Scanner s = new Scanner(System.in);

		System.out.println("=========" + (n + 1) + "��° ȣ��=========");
		System.out.print("ù��° �����Է� : ");
		int tempA = s.nextInt();
		System.out.print("�ι�° �����Է� : ");
		int tempB = s.nextInt();
		System.out.print("�����ڼ���(1:+, 2:-, 3:*, 4:/, 5:%) : ");
		int tempC = s.nextInt();

		if (tempC > 0 && tempC <= 5) {
			this.setA(tempA);
			this.setB(tempB);
			this.setC(tempC);

			this.process();
		} else {
			System.out.println("������ ���� ����");
			System.out.println();
			return;
		}
	}

	// ==================
	// ���� �޼ҵ�
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
	// ��� �޼ҵ�
	// ------------------
	public void printPo(int res, String op) {
		DecimalFormat comma = new DecimalFormat();

		System.out.println("����� : " + this.getA() + " " + op + " " + this.getB() + " = " + comma.format(res));
		System.out.println("==========================");
		System.out.println();
	}

}
