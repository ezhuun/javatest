package coding.day11;

import java.util.*;

//3��
public class HashtableEx {

	public static void main(String[] args) {
		Hashtable h = new Hashtable();

		h.put("15", "ȫ�浿");
		h.put("54", "Ȳ����");
		h.put("76", "�̼ҷ�");
		h.put("123", "�ظ�������");

		System.out.println("Hashtable�� Ű ���� : " + h.size());
		
		Enumeration e = h.keys();
		while (e.hasMoreElements()) {
			String key = (String) e.nextElement();
			String value = (String) h.get(key);
			System.out.println(key + " : " + value);
		}
	}

}
