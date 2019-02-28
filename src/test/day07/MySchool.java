// ������ final�� static�� ����ϴ� �����Դϴ�.
// Hwang�� Park �� ����� �ֽ��ϴ�. 
// �� ����� ���� �����ư��� ���� ������ ���� ������ �Բ� �����ϴ� ��Ȳ�Դϴ�.
// ���) �������: 5��, ���ΰ���: Park 3�� Hwang 2��

package test.day07;

class Work {
	final static int TryCommonCnt = 5; // ������� Ƚ�� ��ǥġ�� ������ ���̴�.
	static int CommonWork = 0;	//�������
	int severalWork = 0;	//���ΰ���
	boolean isHwang = false;

	void doWork() {
		CommonWork++;
		severalWork++;
		if (isHwang == true) {
			System.out.println("���� ����" + CommonWork + "��, " + "Hwang ����" + severalWork + "�� �����߽��ϴ�.");
		} else {
			System.out.println("���� ����" + CommonWork + "��, " + "Park ����" + severalWork + "�� �����߽��ϴ�.");
		}
	}
}

public class MySchool {
	public static void main(String[] args) {
		Work Hwang = new Work();
		Work Park = new Work();
		
		for (int i = 1; i <= Work.TryCommonCnt; i++) {
			if (i % 2 == 0) {
				Hwang.isHwang = true;
				Hwang.doWork();
			} else {
				Park.isHwang = false;
				Park.doWork();
			}
		}
	}
}