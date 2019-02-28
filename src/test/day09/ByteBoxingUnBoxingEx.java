package test.day09;

import java.util.ArrayList;
import java.util.Iterator;

public class ByteBoxingUnBoxingEx {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		list.add((byte) 12); // boxing byte->Byte
		list.add((byte) 55); // boxing
		list.add((byte) 78); // boxing

		BoxingPrint(list);

	}

	public static void BoxingPrint(ArrayList list) {
		Iterator iter = list.iterator();

		byte bt;
		while (iter.hasNext()) {
			bt = (Byte) iter.next(); // unboxing Object->byte
			System.out.println(bt);
		}
	}

}
