package day14;

import java.io.*;

public class CircleTest {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Object.ser"));
		out.writeObject(new Circle(1, 1, 2.4));
		out.writeObject(new Circle(2, 2, 4.8));
		out.writeObject(new String("String implements Serializable"));
		out.close();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Object.ser"));
		Circle c1 = (Circle) in.readObject();
		Circle c2 = (Circle) in.readObject();
		String str = (String) in.readObject();
		in.close();

		c1.showCircleInfo();
		c2.showCircleInfo();
		System.out.println(str);

	}

}

class Circle implements Serializable {
	int xPos;
	int yPos;
	double rad;

	Circle(int x, int y, double r) {
		this.xPos = x;
		this.yPos = y;
		this.rad = r;
	}

	public void showCircleInfo() {
		System.out.printf("[%d %d] \n", xPos, yPos);
		System.out.println("rad: " + rad);
		System.out.println();
	}
}
