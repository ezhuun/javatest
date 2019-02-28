package test.day08;

// ===============
// 메인 클래스
// ===============
public class ThisSuperEx {

	public static void main(String[] args) {
		SubSub ssub = new SubSub();
		System.out.println();
		
		System.out.println("*********************************");
		System.out.println("ssub.common : "+ssub.common);
		System.out.println("ssub.a : "+ssub.a);
		System.out.println("ssub.b : "+ssub.b);
		System.out.println("ssub.c : "+ssub.c);
		
		System.out.println("*********************************");
		SubSub ssub1 = new SubSub("test", 1, 2, 3);
		System.out.println("ssub.a : "+ssub1.a);
		System.out.println("ssub.b : "+ssub1.b);
		System.out.println("ssub.c : "+ssub1.c);		
		System.out.println("*********************************");
		
		System.out.println();
		ssub1.testMethod();	//오버라이딩 메소드 호출
		
		Super ssub2 = ssub1;	//업카운팅
		ssub2.testMethod();	//오버라이딩(동적바인딩) 메소드 호출
	}

}

// ===============
// 슈퍼 클래스
// ===============
class Super {
	String common;
	int a;

	public Super() {
		String common = "";
		int a = 0;
		System.out.println("기본생성자 메소드호출 (Super)클래스");
	}

	public Super(String common, int a) {
		this.common = common;
		this.a = a;
		System.out.println("매개변수가 있는 생성자 메소드호출 (Super)클래스");
		System.out.println("공통 문자열타입 변수 common의 값 : <" + this.common + "> (Super클래스의 멤버변수)");
		System.out.println();
	}
	
	public void testMethod() {
		System.out.println(" ──────────────────────");
	}
	
	
}

// ===============
// 서브 클래스
// ===============
class Sub extends Super {
	String common;
	int b;

	public Sub() {
		String common = "";
		int b = 0;
		System.out.println("기본생성자 메소드호출 (Sub)클래스");
	}

	public Sub(String common, int a, int b) {
		super(common, a);
		this.b = b;
		System.out.println("매개변수가 있는 생성자 메소드호출 (Sub)클래스");
		System.out.println("공통 문자열타입 변수 common의 값 : <" + this.common + "> (Sub클래스의 멤버변수)");
		System.out.println();
	}

	@Override
	public void testMethod() {
		super.testMethod();
		System.out.println("│  super를 통해 상위 메소드 호출  │");
	}
	
}

// ===============
// 서브의 서브 클래스
// ===============
class SubSub extends Sub {
	String common;
	int c;

	public SubSub() {
		String common = "";
		int c = 0;
		System.out.println("기본생성자 메소드호출 (SubSub)클래스");
	}

	public SubSub(String common, int a, int b, int c) {
		super(common, a, b);
		this.c = c;
		System.out.println("매개변수가 있는 생성자 메소드호출 (SubSub)클래스");
		System.out.println("공통 문자열타입 변수 common의 값 : <" + this.common + "> (SubSub클래스의 멤버변수)");
		System.out.println();
	}

	@Override
	public void testMethod() {
		super.testMethod();
		System.out.println(" ──────────────────────");
	}
	

}