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

		System.out.println("set 사이즈 : " + list.size());
		System.out.println(list.contains("chung"));

		list.remove("kim");

		System.out.println("kim 제거 후 set 사이즈 : " + list.size());
		System.out.println("Iterator객체 이용해서 set출력");
		print(list.iterator());

		System.out.println("배열을 이용해서 set출력");
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
