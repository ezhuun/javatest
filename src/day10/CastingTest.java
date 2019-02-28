package day10;

//메인클래스
public class CastingTest {
	public static void main(String[] args) {
		child2 ch = new child2();
		System.out.println(ch.msg);
		System.out.println(ch.getMsg());
		System.out.println(ch.str);
		System.out.println(ch.getStr());
		
		//자식클래스타입 -> 부모클래스타입
		//업캐스팅 자동형변환
		Parent2 p = ch;
		System.out.println(p.msg);
		System.out.println(p.getMsg());

		/*호출 범위를 벗어나 호출 불가 (부모영역만 호출가능)
		System.out.println(p.str);
		System.out.println(p.getStr());*/
		
		
		//부모클래스타입->자식클래스타입
		//다운캐스팅, 명시적 형변환
		child2 ch2 = (child2)p;
		System.out.println(ch2.msg);
		System.out.println(ch2.getMsg());
		System.out.println(ch2.str);
		System.out.println(ch2.getStr());
	}
}

//슈퍼클래스
class Parent2{
	String msg = "여름";
	public String getMsg() {
		return msg;
	}
}

//서브클래스
class child2 extends Parent2{
	String str = "겨울";
	public String getStr() {
		return str;
	}
}
