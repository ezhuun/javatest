package day15;

import java.util.*;

public class SearchDelete {
	public static void main(String[] args) {
		String name[] = { "��ȹ��", "������", "������" };

		Vector v = new Vector();
		for (int i = 0; i < name.length; i++) {
			v.addElement(name[i]);
		}

		if (v.contains("������")) {
			int i = v.indexOf("������");
			System.out.println("�ش� ��ü�� �ε��� : " + (i + 1) + "��°�� �ֽ��ϴ�");
		} else {
			System.out.println("�ش� ��ü�� �����ϴ�");
		}

		v.removeElementAt(0);
		System.out.println("===== ����� �� �Ŀ��� =====");
		String s = "";
		for (int j = 0; j < v.size(); j++) {
			s = (String) v.elementAt(j);
			System.out.println("Vector " + j + "��° ��Ҵ� " + s);
		}

		System.out.println("\n�ʱ���� ũ��...................");
		System.out.println("������Ʈ�� ���� " + v.size());
		System.out.println("������ ũ��� " + v.capacity());

		System.out.println("\nv.trimToSize() �� ...................");
		v.trimToSize();
		System.out.println("������Ʈ�� ���� " + v.size()); // 2
		System.out.println("������ ũ��� " + v.capacity()); // 2

		System.out.println("\n�����̳� ��� �߰� �� ...................");
		v.addElement("�����̳�"); // +1
		System.out.println("������Ʈ�� ���� " + v.size()); // 3
		System.out.println("������ ũ��� " + v.capacity()); // 2*2 = 4

		System.out.println("\nCoder ��� �߰� �� ...................");
		v.addElement("Coder"); // +1
		System.out.println("������Ʈ�� ���� " + v.size()); // 4
		System.out.println("������ ũ��� " + v.capacity()); // 4

		System.out.println("\nPM ��� �߰� �� ...................");
		v.addElement("PM"); // +1
		System.out.println("������Ʈ�� ���� " + v.size()); // 5
		System.out.println("������ ũ��� " + v.capacity()); // 4*2 = 8
	}
}
