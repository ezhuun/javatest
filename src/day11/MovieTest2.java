package day11;

public class MovieTest2 {

	public static void main(String[] args) {
		Action2 act = new Action2();
		act.name="마파도";
		System.out.println(act.name);
	}

}

class TV2{
	public TV2() {
		super();
		System.out.println("TV2");
	}
}
class Movie2 extends TV2{
	String part = "한국 영화";
	public Movie2() {
		super();
		System.out.println("Movie2");
	}
}
class Action2 extends Movie2{
	String name="";
	public Action2() {
		super();	
		System.out.println("Action2");
	}
}