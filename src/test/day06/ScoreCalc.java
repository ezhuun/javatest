package test.day06;

class Score {
	// �̸�, ��������, ��������, ��������, ����, ��� ������� ����
	private String name;
	private int kok;
	private int math;
	private int eng;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setKok(int kok) {
		this.kok = kok;
	}

	public int getKok() {
		return this.kok;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getMath() {
		return this.math;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getEng() {
		return this.eng;
	}

	public int totCalc() {
		return (int) (this.kok + this.math + this.eng);
	}

	public int avgCalc() {
		return (int) this.totCalc() / 3;
	}

	public void scorePrint() {
		System.out.println("-------------------------------");
		System.out.println("����: " + this.name);
		System.out.println("��������: " + this.kok);
		System.out.println("��������: " + this.math);
		System.out.println("��������: " + this.eng);
		System.out.println("����: " + this.totCalc() + "\t���: " + this.avgCalc());
		System.out.println("-------------------------------");
	}
}

class Grade extends Score {

	Grade() {
	}

	Grade(String name, int kok, int math, int eng) {
		super.setName(name);
		super.setKok(kok);
		super.setMath(math);
		super.setEng(eng);

	}

	public String getGrade() {
		String gradeStr;
		int grade = avgCalc() / 10;
		switch (grade) {
		case 10:
		case 9:
			gradeStr = "A";
			break;
		case 8:
			gradeStr = "B";
			break;
		case 7:
			gradeStr = "C";
			break;
		case 6:
			gradeStr = "D";
			break;
		default:
			gradeStr = "����ϼ���";
			break;
		}
		return gradeStr;
	}

	@Override
	public void scorePrint() {
		System.out.println("-------------------------------");
		System.out.println("����: " + getName());
		System.out.println("��������: " + getKok());
		System.out.println("��������: " + getMath());
		System.out.println("��������: " + getEng());
		System.out.println("����: " + totCalc() + "\t���: " + avgCalc());
		System.out.println("����� " + getGrade() + " �Դϴ�");
		System.out.println("-------------------------------");
	}

}

public class ScoreCalc {

	public static void main(String[] args) {

		Grade a1 = new Grade("��浿", 80, 60, 55);
		a1.scorePrint();
		
		Grade a2 = new Grade();
		a2.setEng(80);
		a2.setKok(70);
		a2.setMath(95);
		a2.setName("�̱浿");
		a2.scorePrint();

	}
}
