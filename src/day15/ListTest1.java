package day15;

import java.util.*;

public class ListTest1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		list.add("lee");
		list.clear();

		list.add("cho"); // 0
		list.add("kim"); // 1 -> x
		list.add("chung"); // 2 -> 1
		list.add("min"); // 3 -> 2
		list.add("chung"); // 4 -> 3 -> x

		System.out.println();
		System.out.println("ArrayList ������ : " + list.size());
		System.out.println(list.contains("chung"));

		list.remove("kim");
		list.remove(3);

		System.out.println();
		System.out.println("ArrayList ������ : " + list.size());
		System.out.println("min�� �ִ� ��ġ �� : " + list.indexOf("min"));

		System.out.println();
		System.out.println("Iterator�� �̿��ؼ� ���");
		print(list);

		System.out.println();
		System.out.println("�迭�� �̿��ؼ� ���");
		print(list.toArray());

		System.out.println();
		List sublist = list.subList(0, 2);
		System.out.println("����� �����͸� ���");
		print(sublist);

		System.out.println();
		System.out.println("for���� �̿��ؼ� ���");
		printGet(list);

	}

	public static void print(List list) {
		Iterator iter = list.iterator();
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

	public static void printGet(List list) {
		int count = list.size();
		for (int i = 0; i < count; i++) {
			System.out.println(list.get(i));
		}
	}
}
