package day04;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= 2; i++) {
			for (int j = 2; j>= 0; j--) {
				System.out.print("i=" + i + " j=" + j);
				System.out.print("     ");
				System.out.println("X-MAS");
				if (j == 1) {
					System.out.println("j==1 break");
					break;//�ݺ����� �������� ����� for���� ����
				}
			}
			if (i == 1) {
				System.out.println("i==1 break");
			}
		}
	}

}
