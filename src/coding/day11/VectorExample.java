package coding.day11;

import java.util.*;

//6��
public class VectorExample {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(3);
		System.out.println("������ �ʱ� ũ��� " + v.capacity());

		v.add(new Integer(1));
		v.add(new Integer(22));
		v.add(new Integer(51));
		v.add(new Integer(10));

		System.out.println("������ ũ��� " + v.capacity());
		Collections.sort(v);
		
		for (int i = 0; i < v.size(); i++) {
			Integer n = v.elementAt(i);
			System.out.println(n.toString());
		}
		
	}
	
}