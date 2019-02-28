package day08;

public class Samp {
	int id;

	public Samp(int x) {
		this.id = x;
	}
	public Samp() {
		this.id = 5;
	}
	
	public void set(int x) {
		this.id =x;
	}
	public int get() {
		return this.id;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samp ab1 = new Samp(3);
		Samp ab2 = new Samp();
		Samp s;
		System.out.println(ab1.get());
		System.out.println(ab2.get());
	}

}
