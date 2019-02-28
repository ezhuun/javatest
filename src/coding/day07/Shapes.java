package coding.day07;

import java.text.DecimalFormat;

//메인 클래스
public class Shapes {

	public static void main(String[] args) {

		// 객체 생성
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

// 원 클래스
class Circle {
	private double a; // 지름
	private double area; // 넓이
	private double perimeter; // 둘레

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
	// "원"의 넓이
	// 원의 넓이 = 반지름 * 반지름 * 3.14
	// ------------------
	public void area() {
		this.setArea((this.getA() / 2) * (this.getA() / 2) * Math.PI);
	}

	// ==================
	// "원"의 둘레
	// 원의 둘레 = 반지름 * 2 * 3.14
	// ------------------
	public void perimeter() {
		this.setPerimeter((this.getA() / 2) * 2 * Math.PI);
	}

	// ==================
	// 출력 메소드
	// ------------------
	public void print() {
		DecimalFormat df = new DecimalFormat("###.00");

		this.perimeter();
		this.area();

		System.out.println("Circle \n멤버변수 [diameter : " + this.getA() + " / area : " + this.getArea() + " / a : "
				+ this.getPerimeter() + "]");
		System.out.println("원의 넓이 : " + df.format(this.getArea()));
		System.out.println("원의 둘레 : " + df.format(this.getPerimeter()));
		System.out.println();
	}
}

// 삼각형 클래스
class Triangle {
	private double a;
	private double b;
	private double c;
	private double area; // 넓이
	private double perimeter; // 둘레

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
	// "삼각형"의 넓이
	// 넓이 = Math.sqrt(s*(s-a)*(s-b)*(s-c)) s = (a+b+c)/2
	// ------------------
	public void area() {
		double s = this.getPerimeter() / 2;
		this.setArea(Math.sqrt(s * (s - this.getA()) * (s - this.getB()) * (s - this.getC())));
	}

	// ==================
	// "삼각형"의 둘레
	// ------------------
	public void perimeter() {
		this.setPerimeter((this.getA() + this.getB() + this.getC()));
	}

	// ==================
	// 출력 메소드
	// ------------------
	public void print() {
		DecimalFormat df = new DecimalFormat("###.00");

		this.perimeter();
		this.area();

		System.out.println("Triangle \n멤버변수 [a : " + this.getA() + " / b : " + this.getB() + " / c : " + this.getC()
				+ " / area : " + this.getArea() + " / perimeter : " + this.getPerimeter() + "]");
		System.out.println("삼각형의 넓이 : " + df.format(this.getArea()));
		System.out.println("삼각형의 둘레 : " + df.format(this.getPerimeter()));
		System.out.println();
	}
}

// 직사각형 클래스
class Rectangle {
	private double a; // 가로
	private double b; // 세로
	private double area; // 넓이
	private double perimeter; // 둘레

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
	// "직사각형"의 넓이
	// 넓이 = 가로 * 세로
	// ------------------
	public void area() {
		this.setArea(this.getA() * this.getB());
	}

	// ==================
	// "직사각형"의 둘레
	// 둘레 = (가로+세로) * 2
	// ------------------
	public void perimeter() {
		this.setPerimeter((this.getA() + this.getB()) * 2);

	}

	// ==================
	// 출력 메소드
	// ------------------
	public void print() {
		DecimalFormat df = new DecimalFormat("###.00");

		this.perimeter();
		this.area();

		System.out.println("Rectangle \n멤버변수 [a : " + this.getA() + " / b : " + this.getB() + " / area : "
				+ this.getArea() + " / perimeter : " + this.getPerimeter() + "]");
		System.out.println("사각형의 넓이 : " + df.format(this.getArea()));
		System.out.println("사각형의 둘레 : " + df.format(this.getPerimeter()));
		System.out.println();
	}
}