package test.day05;

public class Test06 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		String str = "";
		if (a < 0) {
			str = "�����Դϴ�";
		} else if (a == 0) {
			str = "0�Դϴ�";
		} else {
			str = "����Դϴ�";
		}
		
		System.out.println(str);
	}
}
