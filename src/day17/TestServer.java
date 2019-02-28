package day17;

import java.io.*;
import java.net.*;

public class TestServer {

	public static void main(String[] args) {
		System.out.println("***** 이지훈 서버 프로그램 작동됨 *****");
		ServerSocket server = null;

		try {
			server = new ServerSocket(2007);
			while (true) {
				System.out.println("클라이언트 접속을 대기중입니다.");

				Socket client = server.accept();

				InetAddress ia = client.getInetAddress();
				int port = client.getLocalPort();
				String ip = ia.getHostAddress();

				System.out.println("클라이언트 접속 : " + " Lolcal Port : " + port + " IP : " + ip);

				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

				writer.write("이지훈 서버에 접속 하신것을 환영합니다");

				writer.flush();
				try {
					client.close();
				} catch (IOException e) {
					System.out.println("Soket을 닫는 중 에러가 발생했습니다" + e.toString());
				}

			}
		} catch (IOException e) {
			System.err.println("Exception generated...");
		} finally {
			try {
				server.close();
				System.out.println("서버 작동을 종료합니다");
			} catch (IOException e) {
				System.out.println("ServerSocket을 닫는 중 에러가 발생했습니다" + e.toString());
			}
		}

		try {
			InputStream is = System.in;
			is.read();
		} catch (IOException e) {

		}
		System.out.println("서버 프로그램 실행을 종료합니다.");
	}

}
