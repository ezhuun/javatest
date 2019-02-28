package test.day06;

public class Instanceof {

	public static void main(String[] args) {

		FireEngine f = new FireEngine();
		Ambulance a = new Ambulance();

		Instanceof test = new Instanceof();
		test.doWork(f);
		test.doWork(a);

	}

	public void doWork(Car c) {
		if (c instanceof FireEngine) {
			FireEngine f = (FireEngine) c;
			f.water();
			f.drive();
		} else if (c instanceof Ambulance) {
			Ambulance a = (Ambulance) c;
			a.siren();
			a.stop();
		}
	}
}

class Car {
	String color;
	int door;

	void drive() { // �����ϴ� ���
		System.out.println("drive, brrrr~");
	}

	void stop() { // ���ߴ� ���
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car { // �ҹ���
	void water() { // �� �Ѹ��� ���
		System.out.println("warter!!!");
	}
}

class Ambulance extends Car {  // �ں深��
    void siren() {             // ���̷��� �︮�� ���
        System.out.println("siren~~~~");
    }
}