package corejava;

import java.text.DecimalFormat;

public class PackTest {

	public static void main(String[] args) {
		// java.lang 패키지는 자동으로 import됨으로
		// import문을 명시할 필요가 없습니다.
		java.lang.String su = "2000000";
		int isu = Integer.parseInt(su);
		java.lang.System.out.println(isu);

		DecimalFormat df = new DecimalFormat("#,##0");
		String str = df.format(isu);
		System.out.println("\\ " + str);
	}
}