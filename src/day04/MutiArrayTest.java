package day04;

public class MutiArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		���� 2������ ������ٰ� �ϴ��� �޸𸮿����� 1���� �������� ���������.
		int[] arr1= new int[3];
		int[][] arr2;
		arr2= new int[2][3];
		
//		���� legth�� ������� ���� ���� ���̸� ������ �ȴ�.
		System.out.println("arr1�迭�� ���� ��: "+arr1.length+"\n");
		System.out.println("arr2�迭�� ���� ��: "+arr2.length+"\n");
		
//		���� ���ؼ� ���� ã�Ƴ���.+
		System.out.println("arr2�迭�� 1���� ���� ��: "+arr2[0].length+"\n");
		System.out.println("arr2�迭�� 2���� ���� ��: "+arr2[1].length+"\n");
	}

}
