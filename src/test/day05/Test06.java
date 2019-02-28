package test.day05;

public class Test06 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		String str = "";
		if (a < 0) {
			str = "음수입니다";
		} else if (a == 0) {
			str = "0입니다";
		} else {
			str = "양수입니다";
		}
		
		System.out.println(str);
	}
}
