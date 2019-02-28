package day15;

import java.util.*;

public class MapTest {

	public static void main(String[] args) {
		HashMap list = new HashMap();
		
		list.put("0", "lee");
		list.clear();

		list.put("1", "cho");
		list.put("2", "kim");
		list.put("3", "chung");
		list.put("4", "min");
		list.put("5", "jung");

		System.out.println(list.size());
		System.out.println(list.containsKey("3"));
		list.remove("2");
		System.out.println(list.size());

		print(list);
	}

	public static void print(Map sets) {
		Set set = sets.keySet();
		// sets.keyset() => �����J�� list�� Ű������ ��ȯ
		Iterator iter = set.iterator();
		while (iter.hasNext() == true) {
			String key = (String) iter.next(); // �ٿ�ĳ����
			System.out.println(key + " " + sets.get(key));
		}
	}

}
