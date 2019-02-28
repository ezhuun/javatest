package day09;

public class DataAccess {

	public static void main(String[] args) {
		Data d = new Data();
		d.setName("왕누이");
		d.setSeason("늦가일");
		d.setYear(35);

		System.out.println(d.getName());
		System.out.println(d.getSeason());
		System.out.println(d.getYear());
	}

}

class Data {
	private String name = null;
	private String season = null;
	private int year = 0;

	public void setName(String name) {
		this.name = name;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public void setYear(int year) {
		if (year >= 20 && year <= 30) {
			this.year = year;
		} else {
			System.out.println("입력될 수 있는 나이는 20-30세 사이입니다");
		}
	}

	public String getName() {
		return this.name;
	}

	public String getSeason() {
		return this.season;
	}

	public int getYear() {
		return this.year;
	}

}