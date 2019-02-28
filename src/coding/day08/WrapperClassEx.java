package coding.day08;

//2��
public class WrapperClassEx {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		char c = '4';
		Double d = new Double(3.1234566);
		System.out.println(Character.toLowerCase('A')); // �빮�� A�� �ҹ��� a�� ��ȯ
		System.out.println(Character.toUpperCase('a')); // �ҹ��� a�� �빮�� A�� ��ȯ

		if (Character.isDigit(c)) { // ���� c�� ���ڸ� ��Ÿ���� true
			System.out.println(Character.getNumericValue(c)); // ���� c�� ���ڷ� ��ȯ�Ͽ� ��� int����ȯ
		}else {
			System.out.println("false");
		}

		System.out.println(Integer.parseInt("-123")); // ���ڿ� "-123"�� ������ ��ȯ
		//System.out.println(Integer.parseInt("2018", 8)); // 16������ ǥ���� ���ڿ� "10"�� ������ ��ȯ
		//System.out.println(Integer.bitCount(28)); // 28�� 16���� ǥ���� ��Ÿ���� ���ڿ�
		System.out.println(Integer.toBinaryString(28)); // 28�� 2���� ǥ���� ��Ÿ���� ���ڿ����
		System.out.println(i.doubleValue()); // i�ǰ�(10)�� double�� ��ȯ�Ͽ� ���
		System.out.println(d.toString()); // d��(3.123..)�� ���ڿ��� ��ȯ�Ͽ� ���
		System.out.println(Double.parseDouble("44.13e-6")); // ���ڿ� "44.13e-6"�� double�� ��ȯ
	}

}
