package day13;

public class Ex2 {
	public static void main(String[] args) {
		String str = "�ȳ��ϼ���";
		
		try {
			System.err.println("���ڿ����� ���ڸ� ��������");
			char c = str.charAt(5);
			System.out.println("������ ���� : " + c);			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			System.out.println("������ ����");
		}
		
		System.out.println("���α׷��� ���������� �������ϴ�");

	}
}
