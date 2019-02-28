package day11;


public class MovieTest3 {

	public static void main(String[] args) {
		Comedy3 com = new Comedy3("21:00", "¸¶ÆÄµµ");
		
		//Comedy3 com2 = new Comedy3();
		
		System.out.println(com.time);
		System.out.println(com.name);
			
	}

}



class Movie3{
	String part = "";
	
	public Movie3() {}
	public Movie3(String part){
		this.part = part;
		System.out.println("Movie3");
	}	
}
class Comedy3 extends Movie3{
	String time = "";
	String name ="";
	
	
	public Comedy3() {
		super();
	}
	
	public Comedy3(String time, String name) {
		super("");
		this.time = time;
		this.name = name;
		System.out.println("Comedy");
	}
	
}

