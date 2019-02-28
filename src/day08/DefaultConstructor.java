package day08;

public class DefaultConstructor {
	int x;
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return this.x;
	}
	
	public DefaultConstructor(int x) {
		this.x = x;
	}
	
	public DefaultConstructor() {}
	
	public static void main(String[] args) {
		DefaultConstructor p1 = new DefaultConstructor(3);
		int n= p1.getX();
		System.out.println(n);
		
		DefaultConstructor p2 = new DefaultConstructor();
		p2.setX(5);
		int m= p2.getX();
		System.out.println(m);

	}

}
