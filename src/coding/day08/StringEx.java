package coding.day08;

//4번
public class StringEx {

	public static void main(String[] args) {
		String a = new String(" abcd");
		String b = new String(",efg");

		System.out.println(a.hashCode());
		
		a = a.concat(b); // 문자열 연결
		System.out.println(a.hashCode());
		
		a = a.trim(); // 공백제거
		System.out.println(a.hashCode());
		
		System.out.println(a);

		a = a.replace("ab", "12"); // 문자열 치환
		System.out.println(a);

		String s[] = a.split(","); // 문자열 나누기
		for (int i = 0; i < s.length; i++) {
			System.out.println("분리된 " + i + "번 문자열 : " + s[i]);
		}

		a = a.substring(3); // 문자을 자르기
		System.out.println(a);

		char c = a.charAt(2); // String문자열을 char문자로 가져오기
		System.out.println(c);
	}

}
