package day11;

public class MovieTest {

	public static void main(String[] args) {
		Action act = new Action();
		act.name = "���ĵ�";
		System.out.println(act.name);
	}

}



class TV {
	String part = "�ѱ���ȭ";
	
	public TV() {

	}
}

class Movie extends TV {
	String name = "";
	
	public Movie() {
		super();
	}
}

class Action extends Movie {
	public Action() {
		super();
	}
}
