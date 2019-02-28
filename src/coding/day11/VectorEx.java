package coding.day11;

import java.util.*;

//1��
public class VectorEx {
	public static void main(String[] args) {
		Vector v = new Vector();

		v.add("Hello");
		v.add(new Integer(4));
		v.add(new Double(3.14));

		System.out.println("���ͳ��� ��� ��ü �� : " + v.size());
		System.out.println("������ ���� �뷮 : " + v.capacity());
		System.out.println();

		for (int i = 0; i < v.size(); i++) {
			Object obj = v.get(i);

			if (obj instanceof String) {
				String str = (String) obj;
				System.out.println("(String)" + str);
			} else if (obj instanceof Integer) {
				Integer x = (Integer) obj;
				int n = x.intValue();
				System.out.println("(Integer)" + n);
			} else if (obj instanceof Double) {
				Double y = (Double) obj;
				double d = y.doubleValue();
				System.out.println("(Double)" + d);
			}

		}
	}
}
