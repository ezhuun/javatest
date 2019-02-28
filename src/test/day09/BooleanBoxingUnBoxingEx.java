package test.day09;

import java.util.*;

public class BooleanBoxingUnBoxingEx {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		list.add(false); // boxing boolean->Boolean
		list.add(true); // boxing
		list.add((Boolean) false); // boxing

		BoxingPrint(list);
	}

	public static void BoxingPrint(ArrayList list) {
		Iterator iter = list.iterator();

		boolean dob;
		while (iter.hasNext()) {
			dob = (Boolean) iter.next(); // unboxing->Boolean
			System.out.println(dob);
		}
	}
}
