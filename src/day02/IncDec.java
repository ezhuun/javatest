package day02;

public class IncDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long i =0;
		long hap =0;
		
		hap = ++i; // i ������ ���� 1�������� hap�� �Ҵ�, ���� ������ 
        hap = i; 
        hap = i++; // hap�� i������ ���� �ְ� i ������ ���� 1����, ���� ������ 
        i++; // ++i  //i = i+1; 
        hap = i; 
        hap = ++hap + ++i; //���� �ƴ� 
        System.out.println("hap: " + hap + "     i: " + i); 
	}

}
