package day17;

import java.io.*;
import java.net.*;

public class TestServer {

	public static void main(String[] args) {
		System.out.println("***** ������ ���� ���α׷� �۵��� *****");
		ServerSocket server = null;

		try {
			server = new ServerSocket(2007);
			while (true) {
				System.out.println("Ŭ���̾�Ʈ ������ ������Դϴ�.");

				Socket client = server.accept();

				InetAddress ia = client.getInetAddress();
				int port = client.getLocalPort();
				String ip = ia.getHostAddress();

				System.out.println("Ŭ���̾�Ʈ ���� : " + " Lolcal Port : " + port + " IP : " + ip);

				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

				writer.write("������ ������ ���� �ϽŰ��� ȯ���մϴ�");

				writer.flush();
				try {
					client.close();
				} catch (IOException e) {
					System.out.println("Soket�� �ݴ� �� ������ �߻��߽��ϴ�" + e.toString());
				}

			}
		} catch (IOException e) {
			System.err.println("Exception generated...");
		} finally {
			try {
				server.close();
				System.out.println("���� �۵��� �����մϴ�");
			} catch (IOException e) {
				System.out.println("ServerSocket�� �ݴ� �� ������ �߻��߽��ϴ�" + e.toString());
			}
		}

		try {
			InputStream is = System.in;
			is.read();
		} catch (IOException e) {

		}
		System.out.println("���� ���α׷� ������ �����մϴ�.");
	}

}
