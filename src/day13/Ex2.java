package day13;

public class Ex2 {
	public static void main(String[] args) {
		String str = "안녕하세요";
		
		try {
			System.err.println("문자열에서 한자만 가져오기");
			char c = str.charAt(5);
			System.out.println("가져온 문자 : " + c);			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			System.out.println("무조건 실행");
		}
		
		System.out.println("프로그램이 정상적으로 끝났습니다");

	}
}
