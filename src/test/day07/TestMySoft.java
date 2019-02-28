package test.day07;

class MySoft {
	private String softName;
	private int softCost;

	static int softTotal = 0; // static 변수

	public void setSoftName(String name) {
		this.softName = name;
	}

	public void setSoftCost(int cost) {
		this.softCost = cost;

		softTotal = softTotal + cost;
	}

	public String getSoftName() {
		return this.softName;
	}

	public int getSoftCost() {
		return this.softCost;
	}
}

public class TestMySoft {

	public static void main(String[] args) {
		MySoft ms1 = new MySoft();
		MySoft ms2 = new MySoft();

		ms1.setSoftName("엑셀프로그램");
		ms1.setSoftCost(200000);

		System.out.println("ms1: " + ms1.getSoftName() + " " + ms1.getSoftCost() + " " + MySoft.softTotal);

		ms2.setSoftName("오피스프로그램");
		ms2.setSoftCost(300000);

		System.out.println("ms2: " + ms2.getSoftName() + " " + ms2.getSoftCost() + " " + MySoft.softTotal);
	}
}