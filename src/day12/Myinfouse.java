package day12;

public class Myinfouse {
	public static void main(String[] args) {
		Myinfointer info = new Myinfo("�Ʒι�", "010-1111-2222", "��õ�� ������", 35);
		System.out.println("�̸�:" + info.getName());
		System.out.println("��ȭ:" + info.getPhone());
		//Myinfo info2 = (Myinfo) info;
		//System.out.println("�ּ�:"+info.getAddress());
		//System.out.println("����:"+info.getAge());
	}
}

interface Myinfointer {
	public String getName();

	public String getPhone();
}

class Myinfo implements Myinfointer {
	private String name;
	private String phone;
	private String address;
	private int age;

	Myinfo() {
	}

	Myinfo(String name, String phone, String address, int age) {
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.age = age;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

}