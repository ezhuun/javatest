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
		System.out.println("---12�� �޿� ����---");
		System.out.println("--------------------");
		System.out.println("����: " + this.name);
		System.out.println("����: " + comma.format(this.bonbong) + "��");
		System.out.println("����: " + comma.format(this.taxCalc()) + "��");
		System.out.println("�Ǽ��ɾ�: " + comma.format(this.silsuCalc()) + "��");
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
		System.out.println("---12�� �޿� ����---");
		System.out.println("--------------------");
		System.out.println("����: " + getName());
		System.out.println("����: " + comma.format(getBonbong()) + "��");
		System.out.println("����: " + comma.format(getAllowance()) + "��");
		System.out.println("����: " + comma.format(taxCalc()) + "��");
		System.out.println("�Ǽ��ɾ�: " + comma.format(silsuCalc()) + "��");
		System.out.println();
	}
}

public class PayCalc {
	public static void main(String[] args) {
		Allowance a1 = new Allowance();
		a1.setBonbong(4000000);
		a1.setName("�ڱ浿");
		a1.setYear(3);
		a1.setChild(1);
		
		a1.payPrint();
		
		Allowance a2 = new Allowance(5, 2, 3000000, "�̱浿");
		a2.payPrint();
		
		
		Pay p1 = new Pay();
		Pay p2 = new Pay();
		Pay p3 = new Pay();

		p1.setName("�մ���");
		p1.setBonbong(2000000);

		p2.setName("�Ʒι�");
		p2.setBonbong(2500000);

		p3.setName("����");
		p3.setBonbong(1500000);

		p1.payPrint();
		p2.payPrint();
		p3.payPrint();

		Pay p4 = new Pay("�̸�", 123123);
		p4.payPrint();

	}
}
