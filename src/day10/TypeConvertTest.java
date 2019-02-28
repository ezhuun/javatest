package day10;

public class TypeConvertTest {

	public static void main(String[] args) {
		TypeConvert tc = new TypeConvert();
		Object obj = tc;
		// System.out.println(obj.getUrl());
		System.out.println(obj.toString());
		System.out.println(tc.getUrl());
		System.out.println(obj.hashCode());
		System.out.println(tc.hashCode());

		TypeConvert tc2 = (TypeConvert) obj;
		System.out.println("tc2: " + tc2.getUrl());
		System.out.println("tc2: " + tc2.hashCode());
	}
}

class TypeConvert {
	String url = "http://www.kma.go.kr";

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return this.url;
	}

	@Override
	public String toString() {
		return "오버라이딩된 자식의 toString 메소드";
	}

}