package day17;

import java.net.*;

public class AddressTest {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("로컬 컴퓨터 이름 : " + address.getHostName());
		System.out.println("로컬 컴퓨터 IP주소 : " + address.getHostAddress());

		
		address = InetAddress.getByName("java.sun.com");
		System.out.println("java.sun.com 도메인 이름과 IP주소 : " + address);

		
		InetAddress SW[] = InetAddress.getAllByName("naver.com");
		for (int i = 0; i < SW.length; i++) {
			System.out.println(SW[i]);
		}

	}

}
