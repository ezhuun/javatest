package coding.day08;

public class ConstructorEx {

	public static void main(String[] args) {
		C c;
		c = new C();
	}

}

class A {
	public A() {
		System.out.println("������A");
	}
}

class B extends A {
	public B() {
		System.out.println("������B");
	}
}

class C extends B {
	public C() {	
		System.out.println("������C");
	}
}


