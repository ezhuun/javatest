package day03;

public class Pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year =5;
		int child=0;
		int pay =1500000;
		
		if(year==0) {
			System.out.println("���Ի���Դϴ�");
		}else if(year==1) {
			pay= pay+20000;
			System.out.println("���1���Դϴ�.");
		}else if(year==2) {
			pay= pay+40000;
			System.out.println("���2���Դϴ�.");
		}
		else if(year==3) {
			pay= pay+60000;
			System.out.println("���3���Դϴ�.");
		}
		else if(year==4) {
			pay= pay+80000;
			System.out.println("���4���Դϴ�.");
		}
		
		if(year >=1) {
			if(child>1) {
				pay= pay+(child*200000);
			}
		}
		System.out.println("�⺻��"+pay);
		System.out.println("����"+(pay*13));
		System.out.println("���޿�"+((pay*13)/12));
	}

}
