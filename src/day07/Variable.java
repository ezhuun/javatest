package day07;

public class Variable {
	String movie = "트로이";

	public void show() {
		System.out.println("show 메소드 영역:" + movie);
	}

	public void title() {
		String movie = "아마겟돈";
		System.out.println("title 메소드 영역:" + movie);
		System.out.println("title this.move:" + this.movie);
	}

	public static void main(String[] args) {
		Variable v = new Variable();
		v.show();
		v.title();
	}
}
