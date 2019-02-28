package day15;

import java.util.*;

public class TestHashTable {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();

		ht.put("AREA01", "대한민국");
		ht.put("AREA02", "러시아");
		ht.put("AREA03", "중국");
		ht.put("AREA04", "일본");

		String area = (String) ht.get("AREA0");

		if (area != null) {
			System.out.println(area);
		} else {
			System.out.println("검색 지역이 없습니다.");
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