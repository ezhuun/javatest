package coding.day08;

public class UpcastingEx1 {
	public static void main(String[] args) {
		Person1 p;
		Student1 s = new Student1("¿Ã¿ÁπÆ");
		p = s;
		System.out.println(p.name);

		// Student1 z = (Student1) p;
		// p.grade = "A";
		// p.department ="Com";

	}
}

class Person1 {
	String name;
	String id;

	public Person1(String name) {
		this.name = name;
	}
}

class Student1 extends Person1 {
	String grade;
	String department;

	public Student1(String name) {
		super(name);
	}
}