package coding.day07;

import java.text.DecimalFormat;

//���� Ŭ����
public class Shapes {

	public static void main(String[] args) {

		// ��ü ����
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		Rectangle rectangle = new Rectangle();

		// circle
		circle.setA(10);
		circle.print();

		// triangle
		triangle.setA(4);
		triangle.setB(5);
		triangle.setC(6);
		triangle.print();

		// rectangle
		rectangle.setA(10);
		rectangle.setB(7);
		rectangle.print();
	}

}

// �� Ŭ����
class Circle {
	private double a; // ����
	private double area; // ����
	private double perimeter; // �ѷ�

	// ==================
	// SET / GET
	// ------------------
	public void setA(double a) {
		this.a = a;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	public double getA() {
		return this.a;
	}

	public double getArea() {
		return this.area;
	}

	public double getPerimeter() {
		return this.perimeter;
	}

	// ==================
	// "��"�� ����
	// ���� ���� = ������ * ������ * 3.14
	// ------------------
	public void area() {
		this.setArea((this.getA() / 2) * (this.getA() / 2) * Math.PI);
	}

	// ==================
	// "��"�� �ѷ�
	// ���� �ѷ� = ������ * 2 * 3.14
	// ------------------
	public void perimeter() {
		this.setPerimeter((this.getA() / 2) * 2 * Math.PI);
	}

	// ==================
	// ��� �޼ҵ�
	// ------------------
	public void print() {
		DecimalFormat df = new DecimalFormat("###.00");

		this.perimeter();
		this.area();

		System.out.println("Circle \n������� [diameter : " + this.getA() + " / area : " + this.getArea() + " / a : "
				+ this.getPerimeter() + "]");
		System.out.println("���� ���� : " + df.format(this.getArea()));
		System.out.println("���� �ѷ� : " + df.format(this.getPerimeter()));
		System.out.println();
	}
}

// �ﰢ�� Ŭ����
class Triangle {
	private double a;
	private double b;
	private double c;
	private double area; // ����
	private double perimeter; // �ѷ�

	// ==================
	// SET / GET
	// ------------------
	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public void setC(double c) {
		this.c = c;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	public double getA() {
		return this.a;
	}

	public double getB() {
		return this.b;
	}

	public double getC() {
		return this.c;
	}

	public double getArea() {
		return this.area;
	}

	public double getPerimeter() {
		return this.perimeter;
	}

	// ==================
	// "�ﰢ��"�� ����
	// ���� = Math.sqrt(s*(s-a)*(s-b)*(s-c)) s = (a+b+c)/2
	// ------------------
	public void area() {
		double s = this.getPerimeter() / 2;
		this.setArea(Math.sqrt(s * (s - this.getA()) * (s - this.getB()) * (s - this.getC())));
	}

	// ==================
	// "�ﰢ��"�� �ѷ�
	// ------------------
	public void perimeter() {
		this.setPerimeter((this.getA() + this.getB() + this.getC()));
	}

	// ==================
	// ��� �޼ҵ�
	// ------------------
	public void print() {
		DecimalFormat df = new DecimalFormat("###.00");

		this.perimeter();
		this.area();

		System.out.println("Triangle \n������� [a : " + this.getA() + " / b : " + this.getB() + " / c : " + this.getC()
				+ " / area : " + this.getArea() + " / perimeter : " + this.getPerimeter() + "]");
		System.out.println("�ﰢ���� ���� : " + df.format(this.getArea()));
		System.out.println("�ﰢ���� �ѷ� : " + df.format(this.getPerimeter()));
		System.out.println();
	}
}

// ���簢�� Ŭ����
class Rectangle {
	private double a; // ����
	private double b; // ����
	private double area; // ����
	private double perimeter; // �ѷ�

	// ==================
	// SET / GET
	// ------------------
	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	public double getA() {
		return this.a;
	}

	public double getB() {
		return this.b;
	}

	public double getArea() {
		return this.area;
	}

	public double getPerimeter() {
		return this.perimeter;
	}

	// ==================
	// "���簢��"�� ����
	// ���� = ���� * ����
	// ------------------
	public void area() {
		this.setArea(this.getA() * this.getB());
	}

	// ==================
	// "���簢��"�� �ѷ�
	// �ѷ� = (����+����) * 2
	// ------------------
	public void perimeter() {
		this.setPerimeter((this.getA() + this.getB()) * 2);

	}

	// ==================
	// ��� �޼ҵ�
	// ------------------
	public void print() {
		DecimalFormat df = new DecimalFormat("###.00");

		this.perimeter();
		this.area();

		System.out.println("Rectangle \n������� [a : " + this.getA() + " / b : " + this.getB() + " / area : "
				+ this.getArea() + " / perimeter : " + this.getPerimeter() + "]");
		System.out.println("�簢���� ���� : " + df.format(this.getArea()));
		System.out.println("�簢���� �ѷ� : " + df.format(this.getPerimeter()));
		System.out.println();
	}
}