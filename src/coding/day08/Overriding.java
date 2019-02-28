package coding.day08;

public class Overriding {
	public static void main(String[] args) {
		Professor a = new Professor(); //객체생성
		a.setPhone("011-1231-1234");
		System.out.println(a.getPhone()); //오버라이딩 메소드 호출

		Person p = a;	//업캐스팅
		System.out.println(p.getPhone()); //동적바인딩으로 오버라이딩된 메소드 호출이다
	}
}

// 슈퍼클래스
class Person {
	String phone;

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return this.phone;
	}
}

// 서브클래스
class Professor extends Person {
	@Override
	public String getPhone() {
		return "Professor : " + super.getPhone();
	}
}
