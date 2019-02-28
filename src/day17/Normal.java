package day17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Normal {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(10);

		list.add(new Integer(10));
		list.add("List Test");

		Iterator i = list.iterator();

		Integer su = (Integer) i.next();
		System.out.println("su=" + su);

		su = (Integer) i.next();
		System.out.println("su=" + su);

	}
}
