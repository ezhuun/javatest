package day10;

//����Ŭ����
public class MainTest2 {

	public static void main(String[] args) {

	}

}

// �θ�Ŭ����
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

// �ڽ�Ŭ����
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
