package day18;

import java.util.*;

public class Generic {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(10);

		list.add(new Integer(10));
		list.add("List Test");

		Iterator i = list.iterator();

		Integer su;
		while (i.hasNext()) {
			su = (Integer) i.next();
			System.out.println("su=" + su);
		}
	}
}
