package day09;

public class PrivateTestMain {

	public static void main(String[] args) {
		PrivateTest pt = new PrivateTest();
		pt.kuk = 90;
		pt.eng = 95;

		//pt.sum();
		pt.call_sum();
		System.out.println("pt.sum() : " + pt.sum);
	}

}

class PrivateTest {
	public int kuk = 0;
	public int eng = 0;
	public int sum = 0;

	private void sum() {
		sum = kuk + eng;
		if (sum > 200) {
			System.out.println("������ 200�� �ʰ��߽��ϴ�");
			sum = 0;
		} else {
			System.out.println("�հ谡 ���������� ó���̽��ϴ�");
		}
	}

	public void call_sum() {
		sum();
	}
}
