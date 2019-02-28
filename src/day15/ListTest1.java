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
		System.out.println("ArrayList 사이즈 : " + list.size());
		System.out.println(list.contains("chung"));

		list.remove("kim");
		list.remove(3);

		System.out.println();
		System.out.println("ArrayList 사이즈 : " + list.size());
		System.out.println("min이 있는 위치 값 : " + list.indexOf("min"));

		System.out.println();
		System.out.println("Iterator를 이용해서 출력");
		print(list);

		System.out.println();
		System.out.println("배열을 이용해서 출력");
		print(list.toArray());

		System.out.println();
		List sublist = list.subList(0, 2);
		System.out.println("추출된 데이터만 출력");
		print(sublist);

		System.out.println();
		System.out.println("for문을 이용해서 출력");
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
