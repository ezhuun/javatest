package day17;

import java.io.*;
import java.net.*;

public class TestClient {

	public static void main(String[] args) {
		System.out.println("클라이언트 프로그램 작동.....");

		Socket socket = null;

		try {
			socket = new Socket(args[0], 2007);
			System.out.println("서버에 연결 되었습니다...");

			InetAddress ia = socket.getInetAddress();
			int port = socket.getLocalPort();
			String ip = ia.getHostAddress();

			System.out.println("접속한 서버 정보 : Local Port : " + port + " IP : " + ip);

			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String line = reader.readLine();
			System.out.println(line);
		} catch (IOException e) {
			System.err.println("Exception generated.....");
		} finally {
			try {
				socket.close();
				System.out.println("서버와의 접속을 종료합니다.");
			} catch (Exception e) {
			}
		}

		InputStream is = System.in;

		try {
			is.read();
		} catch (IOException e) {
		}
		System.out.println("Client 프로그램 실행을 종료합니다.");
	}

}
