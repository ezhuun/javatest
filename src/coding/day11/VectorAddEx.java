package coding.day11;

import java.util.*;

//2��
public class VectorAddEx {
	public static void main(String[] args) {
		Vector v = new Vector();

		v.add("Hello");
		v.add(new Integer(4));
		v.add(new Double(3.14));
		v.add(new Integer(5));

		int sum = 0;
		for (int i = 0; i < v.size(); i++) {
			Object obj = v.get(i);

			if (obj instanceof Integer) {
				Integer x = (Integer) obj;
				int n = x.intValue();
				sum += n;
			}
		}
		System.out.println("��� ������ ���� : " + sum);
	}
}
