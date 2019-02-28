package coding.day08;

//2번
public class WrapperClassEx {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		char c = '4';
		Double d = new Double(3.1234566);
		System.out.println(Character.toLowerCase('A')); // 대문자 A를 소문자 a로 변환
		System.out.println(Character.toUpperCase('a')); // 소문자 a를 대문자 A로 변환

		if (Character.isDigit(c)) { // 문자 c가 숫자를 나타내면 true
			System.out.println(Character.getNumericValue(c)); // 문자 c를 수자로 변환하여 출력 int형반환
		}else {
			System.out.println("false");
		}

		System.out.println(Integer.parseInt("-123")); // 문자열 "-123"을 정수로 변환
		//System.out.println(Integer.parseInt("2018", 8)); // 16진수로 표현된 문자열 "10"을 정수로 변환
		//System.out.println(Integer.bitCount(28)); // 28의 16진수 표현을 나타내는 문자열
		System.out.println(Integer.toBinaryString(28)); // 28을 2진수 표현을 나타내는 문자열출력
		System.out.println(i.doubleValue()); // i의값(10)을 double로 변환하여 출력
		System.out.println(d.toString()); // d값(3.123..)을 문자열로 변환하여 출력
		System.out.println(Double.parseDouble("44.13e-6")); // 문자열 "44.13e-6"을 double로 변환
	}

}
