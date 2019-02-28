package coding.day09;

public class SungjukTest {
	// =============================
	// 메인메소드
	// =============================
	public static void main(String[] args) {
		//ISungjuk iis = new ISungjuk();
		
		ISungjuk is = new Sungjuk(); //업캐스팅
		
		is.setJumsu(90, 85);
		is.print();
	}

}

//인터페이스
interface ISungjuk {
	public void setJumsu(int kuk, int eng);

	public abstract void print();
}

//성적클래스 - 인터페이스 구현
class Sungjuk implements ISungjuk {
	int kuk = 0;
	int eng = 0;

	@Override
	public void setJumsu(int kuk, int eng) {
		this.kuk = kuk;
		this.eng = eng;
	}

	@Override
	public void print() {
		System.out.println("성적증명서");
		System.out.println("국어 : " + this.kuk);
		System.out.println("영어 : " + this.eng);
	}
}
