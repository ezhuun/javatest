package day07;

public class Variable {
	String movie = "Ʈ����";

	public void show() {
		System.out.println("show �޼ҵ� ����:" + movie);
	}

	public void title() {
		String movie = "�Ƹ��ٵ�";
		System.out.println("title �޼ҵ� ����:" + movie);
		System.out.println("title this.move:" + this.movie);
	}

	public static void main(String[] args) {
		Variable v = new Variable();
		v.show();
		v.title();
	}
}
