package day18;

import java.util.*;

public class Generic2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList (10);

		list.add(1);
		list.add(1,2);
		//list.add(2.3);

		Iterator i = list.iterator();
		
		Integer su;
		while(i.hasNext()) {
			su = (Integer) i.next();
			System.out.println("su=" + su);
		}

	}
}
