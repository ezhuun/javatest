package day03;

public class IfTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 120;

		if (i % 2 == 0) {
			int count = 1;
			System.out.println(i + "��(��) ¦��");
			
		}
		//System.out.println("count:"+ count);
		

		if (i % 2 == 0) {
			System.out.println("¦�� " + i);
		} else {
			System.out.println("Ȧ�� " + i);
		}

		if (i % 3 == 0) {
			System.out.println("3�� ���");
		} else if (i % 4 == 0) {
			System.out.println("4�� ���");
		} else if (i % 7 == 0) {
			System.out.println("7�� ���");
		} else {

			System.out.println("3, 4, 7�� ����� �ƴմϴ�.");
		}

		if (1 == 1)
			System.out.println("����");
		if (2 == 2)
			System.out.println("����");

		if (3 == 3) {

			System.out.println("����");

		}
	}
}
