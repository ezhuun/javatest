package coding.day09;

public class ArrayException {
	public static void main(String[] args) {
		int[] intArray = new int[5];
		intArray[0] = 0;

		try {
			for (int i = 0; i < 5; i++) {
				// i=0 intArray[1] = 0+1+0=1
				// i=1 intArray[2] = 1+1+1=3
				// i=2 intArray[3] = 2+1+3=6
				// i=3 intArray[4] = 3+1+6=10
				// i=4 intArray[5] ****�迭�����ʰ�
				intArray[i + 1] = i + 1 + intArray[i];
				System.out.println("intArray[" + i + "] = " + intArray[i]);
			}
		} catch (Exception e) {
			System.out.println("�迭�� �ε����� ������ ������ϴ�");
		}
	}
}
