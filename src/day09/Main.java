package day09;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a);
		System.out.println(a.toString());
		System.out.println(a.hashCode());
		
		int[] b = {1,2,3,4};
		System.out.println(b);
		System.out.println(b.toString());
	}

}

class tt {}

class A {
	public int p;
	private int n;

	public void setN(int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}
	
}

class B extends A {
	private int m;

	public void setM(int m) {
		this.m = m;
	}

	public int getM() {
		return m;
	}

	public String toString() {
		String s = getN() + " " + getM();
		return s;
	}
}