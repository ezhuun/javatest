package day07;

public class Block {
	String Block = "��մ� ��ȭ";

	public static void main(String[] args) {
		String b1 = "Ʈ����";
		System.out.println("Movie:" + b1);// Ʈ����

		{
			String b2 = "��������";
			System.out.println("Movie:" + b2);
			int i = 0;

			for (int j = 0; j < 5; j++) {
				// j�� �� ���ȿ����� �����˴ϴ�
			}
			// System.out.println("j:"+j);

			for (i = 0; i < 5; i++) {
				// i�� �ܺο� ����Ǿ� �־�� �մϴ�
			}
			System.out.println("i:" + i);
		}

		System.out.println("Movie:" + b1);
		// error
		//System.out.println("Movie:"+b2);

	}
}
