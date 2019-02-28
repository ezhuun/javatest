package day15;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		int i = 0;

		Jumsu s = null;

		Jumsu s1 = new Jumsu("¿Õ´«ÀÌ", 100, 80);
		Jumsu s2 = new Jumsu("¾Æ·Î¹Ì", 80, 90);
		Jumsu s3 = new Jumsu("ÅõÅõ", 90, 80);

		ArrayList v = new ArrayList();
		v.add(s1);
		v.add(s2);
		v.add(s3);

		for (i = 0; i < v.size(); i++) {
			s = (Jumsu) v.get(i);
			System.out.print(s.name + "\t");
			System.out.print(s.kuk + "\t");
			System.out.print(s.eng + "\t");
			System.out.print(s.tot + "\t");
			System.out.print(s.avg + "\t\n");
		}

	}

}

class Jumsu {
	String name = "";
	int kuk = 0;
	int eng = 0;
	int tot = 0;
	int avg = 0;

	Jumsu() {
	}

	Jumsu(String name, int kuk, int eng) {
		this.name = name;
		this.kuk = kuk;
		this.eng = eng;
		this.tot = kuk + eng;
		this.avg = (kuk + eng) / 2;
	}
}
