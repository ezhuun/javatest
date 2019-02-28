package day15;

import java.util.*;

public class TestHashTable {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();

		ht.put("AREA01", "���ѹα�");
		ht.put("AREA02", "���þ�");
		ht.put("AREA03", "�߱�");
		ht.put("AREA04", "�Ϻ�");

		String area = (String) ht.get("AREA0");

		if (area != null) {
			System.out.println(area);
		} else {
			System.out.println("�˻� ������ �����ϴ�.");
		}

		System.out.println();
		printI(ht);
		System.out.println();
		printM(ht);
	}

	private static void printI(Map map) {
		Iterator iterator = map.keySet().iterator();

		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			System.out.println(key + " : " + map.get(key));
		}
	}

	private static void printM(Hashtable ht) {
		Enumeration e = ht.keys();
		while (e.hasMoreElements()) {
			String key = (String) e.nextElement();
			System.out.println(key + " : " + ht.get(key));
		}

	}
}