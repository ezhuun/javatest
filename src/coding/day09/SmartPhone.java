package coding.day09;

//메인클래스 정의
public class SmartPhone extends PDA implements MobilePhone, MP3 {

	// ============================
	// 메인메소드
	// ============================
	public static void main(String[] args) {
		SmartPhone p = new SmartPhone();
		p.sendCall();
		p.play();
		p.calculate(3, 5);
		p.scheduler();
	}
	
	
	// ============================
	// 메인클래스-메소드 추가 정의
	// ============================
	public void scheduler() {
		System.out.println("일정관리");
	}

	public void applicationManager() {
		System.out.println("어플리케이션 설치/삭제");
	}

	
	// ============================
	// 추상메소드
	// ============================
	@Override
	public void play() {
		System.out.println("음악 재생");
	}

	@Override
	public void stop() {
		System.out.println("재생 중지");
	}

	@Override
	public boolean sendCall() {
		System.out.println("전화 걸기");
		return true;
	}

	@Override
	public boolean receiveCall() {
		System.out.println("전화 받기");
		return true;
	}

	@Override
	public boolean sendSMS() {
		System.out.println("SMS 보내기");
		return true;
	}

	@Override
	public boolean receiveSMS() {
		System.out.println("SMS 받기");
		return true;
	}

}

// 인터페이스1 정의
interface MobilePhone {
	public boolean sendCall();

	public boolean receiveCall();

	public boolean sendSMS();

	public boolean receiveSMS();
}

// 인터페이스2 정의
interface MP3 {
	public void play();

	public void stop();
}

// 부모클래스 정의
class PDA {
	public int calculate(int x, int y) {
		return x + y;
	}
}