package day15;

import java.util.*;

public class VectorTest2 {
	public static void main(String[] args) {
		int i = 0;

		Sungjuk s = null;

		Sungjuk s1 = new Sungjuk("ø’¥´¿Ã", 100, 80);
		Sungjuk s2 = new Sungjuk("æ∆∑ŒπÃ", 80, 90);
		Sungjuk s3 = new Sungjuk("≈ı≈ı", 90, 80);

		Vector v = new Vector();
		v.addElement(s1);
		v.addElement(s2);
		v.addElement(s3);

		for (i = 0; i < v.size(); i++) {
			s = (Sungjuk) v.get(i);
			System.out.print(s.name + "\t");
			System.out.print(s.kuk + "\t");
			System.out.print(s.eng + "\t");
			System.out.print(s.tot + "\t");
			System.out.print(s.avg + "\t\n");
		}
	}
}

class Sungjuk {
	String name = "";
	int kuk = 0;
	int eng = 0;
	int tot = 0;
	int avg = 0;

	Sungjuk() {
	}

	Sungjuk(String name, int kuk, int eng) {
		this.name = name;
		this.kuk = kuk;
		this.eng = eng;
		this.tot = kuk + eng;
		this.avg = (kuk + eng) / 2;
	}
}
