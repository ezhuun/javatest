package day17;

import java.util.Vector;

public class BoxingUnBoxingMain2 {

	public static void main(String[] args) {
		Vector v = new Vector(5, 5);
		v.add(new Integer(3));
		v.add(1);
		v.add(5);
		v.add(8);
		
		Integer gg = 3;
		int ff = new Integer(4);
		int aa = (Integer) v.get(2);
		System.out.println("unboxing¿¹ : " + aa);
		prints(v);		
	}

	public static void prints(Vector vi) {
		int num = vi.size();
		int sum = 0;
		for (int j = 0; j < num; j++) {
			sum += (Integer) vi.get(j);
		}
		System.out.println("ÇÕ : " + sum);
	}

}
