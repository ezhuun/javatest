package coding.day11;

import java.util.*;

//4��
public class HashTableExample {

	public static void main(String[] args) {
		Hashtable members = new Hashtable();

		Scanner sin = new Scanner(System.in);

		System.out.println("�̸��� ��ȭ��ȣ �������� �и��Ͽ� 2���� �Է��Ͻÿ�.");
		for (int i = 0; i < 2; i++) {
			System.out.print("�̸� ��ȭ��ȣ : ");
			String name = sin.next();
			String tel = sin.next();

			members.put(name, tel);
		}
		
		System.out.println("��ȭ��ȣ�� �˻��� �̸��� �Է��Ͻʽÿ�.");
		String key = sin.next();
		String val = (String) members.get(key);
		if (val != null) {
			System.out.println(key + " �� ��ȭ��ȣ�� " + val + " �Դϴ�");
		} else {
			System.out.println("�Է��Ͻ� �̸��� ã�� �� �����ϴ�");
		}
	}

}
