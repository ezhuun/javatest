package day06;

import java.text.DecimalFormat;

class Pay {
	private String name;
	private int bonbong;

	public Pay() {
	}

	public Pay(String name, int bonbong) {
		this.setName(name);
		this.setBonbong(bonbong);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setBonbong(int bonbong) {
		this.bonbong = bonbong;
	}

	public int getBonbong() {
		return this.bonbong;
	}

	public int taxCalc() {
		return (int) (this.bonbong * 0.045 + 0.5);
	}

	public int silsuCalc() {
		return (int) (this.bonbong - this.taxCalc());
	}

	public void payPrint() {
		DecimalFormat comma = new DecimalFormat();

		System.out.println("--------------------");
		System.out.println("---12월 급여 내역---");
		System.out.println("--------------------");
		System.out.println("성명: " + this.name);
		System.out.println("본봉: " + comma.format(this.bonbong) + "원");
		System.out.println("세금: " + comma.format(this.taxCalc()) + "원");
		System.out.println("실수령액: " + comma.format(this.silsuCalc()) + "원");
	}
}

class Allowance extends Pay {
	private int year;
	private int child;

	Allowance() {
	}

	Allowance(int year, int child, int bonbong, String name) {
		setName(name);
		setBonbong(bonbong);
		this.year = year;
		this.child = child;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	public void setChild(int child) {
		this.child = child;
	}
	public int getYear() {
		return this.year;
	}
	public int getChild() {
		return this.child; 
	}
	
	
	public int getAllowance() {
		int allowance = 0;

		if (year == 0) {
		} else if (year == 1) {
			allowance = 200000;
		} else if (year == 2) {
			allowance = 400000;
		} else if (year == 3) {
			allowance = 600000;
		} else if (year == 4) {
			allowance = 800000;
		}

		if (year >= 1) {
			if (child > 1) {
				allowance += (child * 200000);
			}
		}

		return allowance;
	}
	
	@Override
	public int silsuCalc() {
		return (int) (getBonbong() + getAllowance() - taxCalc());
	}

	@Override
	public void payPrint() {
		DecimalFormat comma = new DecimalFormat();

		System.out.println("--------------------");
		System.out.println("---12월 급여 내역---");
		System.out.println("--------------------");
		System.out.println("성명: " + getName());
		System.out.println("본봉: " + comma.format(getBonbong()) + "원");
		System.out.println("수당: " + comma.format(getAllowance()) + "원");
		System.out.println("세금: " + comma.format(taxCalc()) + "원");
		System.out.println("실수령액: " + comma.format(silsuCalc()) + "원");
		System.out.println();
	}
}

public class PayCalc {
	public static void main(String[] args) {
		Allowance a1 = new Allowance();
		a1.setBonbong(4000000);
		a1.setName("박길동");
		a1.setYear(3);
		a1.setChild(1);
		
		a1.payPrint();
		
		Allowance a2 = new Allowance(5, 2, 3000000, "이길동");
		a2.payPrint();
		
		
		Pay p1 = new Pay();
		Pay p2 = new Pay();
		Pay p3 = new Pay();

		p1.setName("왕눈이");
		p1.setBonbong(2000000);

		p2.setName("아로미");
		p2.setBonbong(2500000);

		p3.setName("투투");
		p3.setBonbong(1500000);

		p1.payPrint();
		p2.payPrint();
		p3.payPrint();

		Pay p4 = new Pay("이름", 123123);
		p4.payPrint();

	}
}
