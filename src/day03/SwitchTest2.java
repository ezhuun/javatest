package day03;

public class SwitchTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='C';
		String str ="C";
		
		switch (str.charAt(0)) {
		case 'A':
			System.out.println("�Էµ��ڵ�� A�Դϴ�.");
			break;
		case 'B':
			System.out.println("�Էµ��ڵ�� B�Դϴ�.");
			break;
		case 'C':
			System.out.println("�Էµ��ڵ�� C�Դϴ�.");
			break;
		case 'D':
			System.out.println("�Էµ��ڵ�� D�Դϴ�.");
			break;

		default:
			System.out.println("�ڵ�� A���� D���� �Է��ؾ� �մϴ�.");
			break;
		}
	}

}
