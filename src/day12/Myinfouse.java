package day12;

public class Myinfouse {
	public static void main(String[] args) {
		Myinfointer info = new Myinfo("아로미", "010-1111-2222", "인천시 남동구", 35);
		System.out.println("이름:" + info.getName());
		System.out.println("전화:" + info.getPhone());
		//Myinfo info2 = (Myinfo) info;
		//System.out.println("주소:"+info.getAddress());
		//System.out.println("나이:"+info.getAge());
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