package corejava;

import java.text.DecimalFormat;

public class PackTest {

	public static void main(String[] args) {
		// java.lang ��Ű���� �ڵ����� import������
		// import���� ����� �ʿ䰡 �����ϴ�.
		java.lang.String su = "2000000";
		int isu = Integer.parseInt(su);
		java.lang.System.out.println(isu);

		DecimalFormat df = new DecimalFormat("#,##0");
		String str = df.format(isu);
		System.out.println("\\ " + str);
	}
}