package coding.day03;

public class Calc {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < args.length; i++) { // ����� ������ ������ŭ �ݺ�
			int n = Integer.parseInt(args[i]); // ����� ������ ���ڿ��� ������ ��ȯ
			sum += n; // ���ڸ� ���Ѵ�.
		}
		System.out.println("sum = " + sum);
	}
}
