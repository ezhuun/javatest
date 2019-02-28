package coding.day08;

public class Overriding {
	public static void main(String[] args) {
		Professor a = new Professor(); //��ü����
		a.setPhone("011-1231-1234");
		System.out.println(a.getPhone()); //�������̵� �޼ҵ� ȣ��

		Person p = a;	//��ĳ����
		System.out.println(p.getPhone()); //�������ε����� �������̵��� �޼ҵ� ȣ���̴�
	}
}

// ����Ŭ����
class Person {
	String phone;

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return this.phone;
	}
}

// ����Ŭ����
class Professor extends Person {
	@Override
	public String getPhone() {
		return "Professor : " + super.getPhone();
	}
}
