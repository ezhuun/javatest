package day10;

//메인클래스
public class MainTest2 {

	public static void main(String[] args) {

	}

}

// 부모클래스
class Person {
	String name;
	String phone;
	static int ID;

	public void setName(String s) {
		name = s;
	}

	public String getPhone() {
		return phone;
	}

	public int getID() {
		return ID;
	}
}

// 자식클래스
class Professor extends Person {

	public void setName(String s) {
	}

	public String getPhone() {
		return phone;
	}

	public void getPhone(String phone) {
	}

	public int getID() {
		return ID;
	}
}
