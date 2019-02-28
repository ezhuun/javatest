package day10;

//����Ŭ����
public class Ex01 {

	public static void main(String[] args) {

		Korean kor = new Korean("������", 30, "����", "�ѱ�", false);
		American ame = new American("Ian", 21, "����", "USA", true);
		Person3 per = new Person3("��������", 25, "����", "����");

		System.out.println(ame.isEnglish()); // true
		Person3 aper = ame; // ��ĳ����
		
		//��ĳ�������� ���� �����ʰ��� ���ٺҰ�
		//System.out.println(aper.isEnglish());
		
		American ame2 = (American) aper; // �ٿ�ĳ����
		System.out.println(ame2.isEnglish()); // true
		System.out.println("---------------");

		Ex01.printInfo(kor);
		Ex01.printInfo(ame2);
		Ex01.printInfo(per);

		Ex01.printInfo2(kor);
		Ex01.printInfo2(ame2);
		Ex01.printInfo2(per);
	}

	public static void printInfo(Person3 person) {
		System.out.println(person.getName() + "\n" + person.getAge() + "\n" + person.getGender() + "\n"
				+ person.getNation() + "\n" + "-----------");
	}

	public static void printInfo2(Person3 person) {
		//��ü������ � Ŭ����Ÿ������ Ȯ���ϱ� ���Ͽ� instanceof ���
		//(��ü���� instanceof Ŭ����Ÿ��)��  booleanŸ������ return
		if (person instanceof Korean) {
			Korean k = (Korean) person;
			System.out.println(k.getName() + "\n" + k.getAge() + "\n" + k.getGender() + "\n" + k.getName() + "\n"
					+ k.isMilitary() + "\n" + "-----------k");
		} else if (person instanceof American) {
			American a = (American) person;
			System.out.println(a.getName() + "\n" + a.getAge() + "\n" + a.getGender() + "\n" + a.getName() + "\n"
					+ a.isEnglish() + "\n" + "-----------a");
		} else {
			System.out.println(person.getName() + "\n" + person.getAge() + "\n" + person.getGender() + "\n"
					+ person.getNation() + "\n" + "-------------p");
		}
	}

}

//����Ŭ����
class Person3 {
	private String name;
	private int age;
	private String gender;
	private String nation;

	public Person3(String name, int age, String gender, String nation) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.nation = nation;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getNation() {
		return nation;
	}
}

//����Ŭ����1
class Korean extends Person3 {
	private boolean military;

	public Korean(String name, int age, String gender, String nation, boolean military) {
		super(name, age, gender, nation);
		this.military = military;
	}

	public void setMilitary(boolean military) {
		this.military = military;
	}

	public boolean isMilitary() {
		return military;
	}
}

//����Ŭ����2
class American extends Person3 {
	private boolean english;

	public American(String name, int age, String gender, String nation, boolean english) {
		super(name, age, gender, nation);
		this.english = english;
	}

	public void setEnglish(boolean english) {
		this.english = english;
	}

	public boolean isEnglish() {
		return english;
	}
}