package coding.day08;

//7��
public class MathEx {

	public static void main(String[] args) {
		double a = -2.78987434;

		System.out.println(Math.abs(a)); // ���밪
		System.out.println(Math.ceil(a)); // �ڸ��� �ø�
		System.out.println(Math.floor(a)); // �ڸ�������
		System.out.println(Math.sqrt(9.0)); // ������
		System.out.println(Math.exp(1.5)); // exp�Լ��� �ڿ��α��� ���� e(2.718....)�� x������ ���Ѵ�
		System.out.println(Math.rint(3.141592)); // rintrint : �μ��� ���� ����� ������ ��ȯ

		System.out.println("�̹��� ����� ��ȣ�� ");
		for (int i = 0; i < 5; i++) {
			System.out.println(Math.round(1 + Math.random() * 10) + ""); // �����߻�
		}
		System.out.println("�Դϴ�.");

	}

}
