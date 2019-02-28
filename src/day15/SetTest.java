package day15;

import java.util.*;

public class SetTest {
	public static void main(String[] args) {
		HashSet list = new HashSet();

		list.add("lee");
		list.clear();
		list.add("cho");
		list.add("kim");
		list.add("chung");
		list.add("min");
		list.add("chung");

		System.out.println("set ������ : " + list.size());
		System.out.println(list.contains("chung"));

		list.remove("kim");

		System.out.println("kim ���� �� set ������ : " + list.size());
		System.out.println("Iterator��ü �̿��ؼ� set���");
		print(list.iterator());

		System.out.println("�迭�� �̿��ؼ� set���");
		print(list.toArray());
	}

	public static void print(Iterator iter) {
		while (iter.hasNext()) {
			String str = (String) iter.next();
			System.out.println(str);
		}
	}

	public static void print(Object[] obj) {
		int count = obj.length;
		for (int i = 0; i < count; i++) {
			System.out.println(obj[i]);
		}
	}
}
