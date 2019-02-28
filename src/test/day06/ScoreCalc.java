package test.day06;

class Score {
	// 이름, 국어점수, 수학점수, 영어점수, 총점, 평균 멤버변수 생성
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
		System.out.println("성명: " + this.name);
		System.out.println("국어점수: " + this.kok);
		System.out.println("수학점수: " + this.math);
		System.out.println("영어점수: " + this.eng);
		System.out.println("총점: " + this.totCalc() + "\t평균: " + this.avgCalc());
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
			gradeStr = "노력하세요";
			break;
		}
		return gradeStr;
	}

	@Override
	public void scorePrint() {
		System.out.println("-------------------------------");
		System.out.println("성명: " + getName());
		System.out.println("국어점수: " + getKok());
		System.out.println("수학점수: " + getMath());
		System.out.println("영어점수: " + getEng());
		System.out.println("총점: " + totCalc() + "\t평균: " + avgCalc());
		System.out.println("등급은 " + getGrade() + " 입니다");
		System.out.println("-------------------------------");
	}

}

public class ScoreCalc {

	public static void main(String[] args) {

		Grade a1 = new Grade("김길동", 80, 60, 55);
		a1.scorePrint();
		
		Grade a2 = new Grade();
		a2.setEng(80);
		a2.setKok(70);
		a2.setMath(95);
		a2.setName("이길동");
		a2.scorePrint();

	}
}
