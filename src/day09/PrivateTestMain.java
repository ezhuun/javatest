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
			System.out.println("점수가 200을 초과했습니다");
			sum = 0;
		} else {
			System.out.println("합계가 정상적으로 처리됫습니다");
		}
	}

	public void call_sum() {
		sum();
	}
}
