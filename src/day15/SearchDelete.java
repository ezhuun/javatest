package day15;

import java.util.*;

public class SearchDelete {
	public static void main(String[] args) {
		String name[] = { "기획자", "설계자", "개발자" };

		Vector v = new Vector();
		for (int i = 0; i < name.length; i++) {
			v.addElement(name[i]);
		}

		if (v.contains("개발자")) {
			int i = v.indexOf("개발자");
			System.out.println("해당 객체의 인덱스 : " + (i + 1) + "번째에 있습니다");
		} else {
			System.out.println("해당 객체가 없습니다");
		}

		v.removeElementAt(0);
		System.out.println("===== 지우고 난 후에는 =====");
		String s = "";
		for (int j = 0; j < v.size(); j++) {
			s = (String) v.elementAt(j);
			System.out.println("Vector " + j + "번째 요소는 " + s);
		}

		System.out.println("\n초기상태 크기...................");
		System.out.println("엘러먼트의 수는 " + v.size());
		System.out.println("벡터의 크기는 " + v.capacity());

		System.out.println("\nv.trimToSize() 후 ...................");
		v.trimToSize();
		System.out.println("엘러먼트의 수는 " + v.size()); // 2
		System.out.println("벡터의 크기는 " + v.capacity()); // 2

		System.out.println("\n디자이너 요소 추가 후 ...................");
		v.addElement("디자이너"); // +1
		System.out.println("엘러먼트의 수는 " + v.size()); // 3
		System.out.println("벡터의 크기는 " + v.capacity()); // 2*2 = 4

		System.out.println("\nCoder 요소 추가 후 ...................");
		v.addElement("Coder"); // +1
		System.out.println("엘러먼트의 수는 " + v.size()); // 4
		System.out.println("벡터의 크기는 " + v.capacity()); // 4

		System.out.println("\nPM 요소 추가 후 ...................");
		v.addElement("PM"); // +1
		System.out.println("엘러먼트의 수는 " + v.size()); // 5
		System.out.println("벡터의 크기는 " + v.capacity()); // 4*2 = 8
	}
}
