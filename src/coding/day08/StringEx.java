package coding.day08;

//4��
public class StringEx {

	public static void main(String[] args) {
		String a = new String(" abcd");
		String b = new String(",efg");

		System.out.println(a.hashCode());
		
		a = a.concat(b); // ���ڿ� ����
		System.out.println(a.hashCode());
		
		a = a.trim(); // ��������
		System.out.println(a.hashCode());
		
		System.out.println(a);

		a = a.replace("ab", "12"); // ���ڿ� ġȯ
		System.out.println(a);

		String s[] = a.split(","); // ���ڿ� ������
		for (int i = 0; i < s.length; i++) {
			System.out.println("�и��� " + i + "�� ���ڿ� : " + s[i]);
		}

		a = a.substring(3); // ������ �ڸ���
		System.out.println(a);

		char c = a.charAt(2); // String���ڿ��� char���ڷ� ��������
		System.out.println(c);
	}

}
