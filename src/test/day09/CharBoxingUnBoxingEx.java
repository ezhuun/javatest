package test.day09;

import java.util.ArrayList;
import java.util.Iterator;

public class CharBoxingUnBoxingEx {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add((int)49556);
		list.add((int)45936);
		list.add((int)49828);
		list.add((int)53356);
		
		prints(list);
	}

	public static void prints(ArrayList list) {
		Iterator iter = list.iterator();

		int n;
		char temp;
		while (iter.hasNext()) {
			n = (Integer)iter.next();
			temp =(char)n;
			System.out.print(temp);
		}
	}
}
