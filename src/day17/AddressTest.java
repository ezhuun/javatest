package day17;

import java.net.*;

public class AddressTest {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("���� ��ǻ�� �̸� : " + address.getHostName());
		System.out.println("���� ��ǻ�� IP�ּ� : " + address.getHostAddress());

		
		address = InetAddress.getByName("java.sun.com");
		System.out.println("java.sun.com ������ �̸��� IP�ּ� : " + address);

		
		InetAddress SW[] = InetAddress.getAllByName("naver.com");
		for (int i = 0; i < SW.length; i++) {
			System.out.println(SW[i]);
		}

	}

}
