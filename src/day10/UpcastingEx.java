package day10;

public class UpcastingEx {

	public static void main(String[] args) {
		Person1 p;
		Student s = new Student("¿Ã¿ÁπÆ");
		p = s;
		System.out.println(p.name);
			
		Student s2 = (Student)p;
		s2.grade = "A";
		s2.department = "Com";
	}

}


class Person1{
	String name;
	String id;
	
	public Person1(String name) {
		this.name = name;
	}
}

class Student extends Person1{
	String grade;
	String department;
	
	public Student(String name) {
		super(name);
	}
}
