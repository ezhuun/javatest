package coding.day09;

public class SungjukTest {
	// =============================
	// ���θ޼ҵ�
	// =============================
	public static void main(String[] args) {
		//ISungjuk iis = new ISungjuk();
		
		ISungjuk is = new Sungjuk(); //��ĳ����
		
		is.setJumsu(90, 85);
		is.print();
	}

}

//�������̽�
interface ISungjuk {
	public void setJumsu(int kuk, int eng);

	public abstract void print();
}

//����Ŭ���� - �������̽� ����
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
		System.out.println("��������");
		System.out.println("���� : " + this.kuk);
		System.out.println("���� : " + this.eng);
	}
}
