package test.day03;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 5;
		int child = 0;
		int pay = 1500000;

		switch (year) {
		case 0:
			System.out.println("���Ի���Դϴ�");
			break;
		case 1:
			System.out.println("��� 1���Դϴ�.");
			pay = pay + 20000;
			break;
		case 2:
			pay = pay + 40000;
			break;
		case 3:
			pay = pay + 60000;
			break;
		case 4:
			pay = pay + 80000;
			break;
		default:
			pay = pay + 1500000;

		}
		if (year >= 1) {
			if (child > 1) {
				pay = pay + (child * 200000);
			}
		}

		System.out.println("�⺻��: " + pay);
		System.out.println("��  ��: " + (pay * 13));
		System.out.println("���޿�: " + ((pay * 13) / 12));

	}

}
