package coding.day09;

//����Ŭ���� ����
public class SmartPhone extends PDA implements MobilePhone, MP3 {

	// ============================
	// ���θ޼ҵ�
	// ============================
	public static void main(String[] args) {
		SmartPhone p = new SmartPhone();
		p.sendCall();
		p.play();
		p.calculate(3, 5);
		p.scheduler();
	}
	
	
	// ============================
	// ����Ŭ����-�޼ҵ� �߰� ����
	// ============================
	public void scheduler() {
		System.out.println("��������");
	}

	public void applicationManager() {
		System.out.println("���ø����̼� ��ġ/����");
	}

	
	// ============================
	// �߻�޼ҵ�
	// ============================
	@Override
	public void play() {
		System.out.println("���� ���");
	}

	@Override
	public void stop() {
		System.out.println("��� ����");
	}

	@Override
	public boolean sendCall() {
		System.out.println("��ȭ �ɱ�");
		return true;
	}

	@Override
	public boolean receiveCall() {
		System.out.println("��ȭ �ޱ�");
		return true;
	}

	@Override
	public boolean sendSMS() {
		System.out.println("SMS ������");
		return true;
	}

	@Override
	public boolean receiveSMS() {
		System.out.println("SMS �ޱ�");
		return true;
	}

}

// �������̽�1 ����
interface MobilePhone {
	public boolean sendCall();

	public boolean receiveCall();

	public boolean sendSMS();

	public boolean receiveSMS();
}

// �������̽�2 ����
interface MP3 {
	public void play();

	public void stop();
}

// �θ�Ŭ���� ����
class PDA {
	public int calculate(int x, int y) {
		return x + y;
	}
}