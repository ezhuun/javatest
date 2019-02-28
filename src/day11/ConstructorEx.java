package day11;

public class ConstructorEx {
	
	public static void main(String[] args) {
		C c;
		c = new C();
	}
	
}


class A{
	public A(){
		super();
		System.out.println("持失切 A");
	}
}
class B extends A{
	public B(){
		super();
		System.out.println("持失切 B");
	}
}
class C extends B{
	public C(){
		super();
		System.out.println("持失切 C");
	}
}