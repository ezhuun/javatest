package day08;

public class AvgTest {

	public static void main(String[] args) {
		AvgTest st = new AvgTest();
		System.out.println(st.getAvg());
		System.out.println(st.getAvg(10, 20));
		System.out.println(st.getAvg(10.5f, 20.5f));
		System.out.println(st.getAvg(10, 20, 30));
		System.out.println(st.getAvg(10, 20, 30, 40));

	}

	public int getAvg() {
		System.out.println("값을 2개이상 입력해주세요;");
		return 0;
	}

//	public int getAvg(int a, int b) {
//		return (a + b) / 2;
//	}

	public int getAvg(float a, float b) {
		return ((int) a + (int) b) / 2;
	}

	public int getAvg(int a, int b, int c) {
		return (a + b + c) / 3;
	}

	public int getAvg(int a, int b, int c, int d) {
		return (a + b + c + d) / 4;
	}

}
