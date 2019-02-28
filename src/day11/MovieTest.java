package day11;

public class MovieTest {

	public static void main(String[] args) {
		Action act = new Action();
		act.name = "마파도";
		System.out.println(act.name);
	}

}



class TV {
	String part = "한국영화";
	
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
