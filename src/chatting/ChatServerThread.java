package chatting;

import java.io.*;
import java.net.*;

public class ChatServerThread {

	private Socket socket = null;
	private ServerSocket server = null;

	public void serverStart() {
		System.out.println("�����ڸ� ��ٸ��� ���Դϴ�.");
		try {
			server = new ServerSocket(2007);
			socket = server.accept();

			InetAddress ia = socket.getInetAddress();
			int port = socket.getLocalPort();// ���ӿ� ���� PORT
			String ip = ia.getHostAddress(); // ���� Client IP

			System.out.print("Ŭ���̾�Ʈ ����-Local Port: " + port);
			System.out.println(" Client IP: " + ip);
			
			
			
			// �����͸� �о���� ������
			ChatServerReadHandler read = new ChatServerReadHandler(socket);
			read.start();
			
			// �����͸� ������ ������
			ChatServerSendHandler send = new ChatServerSendHandler(socket);
			send.start();
		} catch (IOException ioe) {
			System.err.println("������ �Ǿ� ���� �ʽ��ϴ�.");
		} finally {
			try {
				server.close();
			} catch (IOException ignored) {
			}
		}

	}

	public static void main(String[] args) {
		ChatServerThread cs = new ChatServerThread();
		cs.serverStart();
	}
}

/** 
 * �����͸� �о�ɴϴ�. 
 * @author stu 
 * 
 */ 

class ChatServerReadHandler extends Thread {
	private Socket socket;
	private String line; // �����κ��� �о�� ���ڿ� ����

	public ChatServerReadHandler() {
		System.out.println("���α׷��� �ʱ�ȭ ���� �ʾҽ��ϴ�.");
	}

	public ChatServerReadHandler(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (true) {
				line = reader.readLine();

				if (line == null) {
					break;
				}
				System.out.println("\t\t\t������: " + line);
				System.out.print("�� ");
			}

		} catch (IOException ignored) {
		} finally {
			try {
				socket.close();
			} catch (IOException ignored) {
			}
		}
	}

}

/**
 * �����͸� �����ϴ�.
 * 
 * @author stu
 * 
 */
class ChatServerSendHandler extends Thread {
	private Socket socket;
	private BufferedWriter writer;
	private BufferedReader in;
	private String s = "";

	public ChatServerSendHandler() {
		System.out.println("���α׷��� �ʱ�ȭ ���� �ʾҽ��ϴ�.");
	}

	public ChatServerSendHandler(Socket socket) {
		this.socket = socket;
		try {
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			in = new BufferedReader(new InputStreamReader(System.in));
		} catch (Exception e) {
			System.err.println("������ �Ǿ� ���� �ʽ��ϴ�.");
		}
	}

	public void run() {
		try {
			while (true) {
				System.out.print("�� ");
				s = in.readLine(); // Ű����κ��� �Է�
				if (s.equals("999")) {
					break; // �����ڵ�
				}
				writer.write(s);
				writer.newLine(); // �ٹٲ� ��ȣ�� �־�� BufferedReader�� readLine()�� �ν���
				writer.flush(); // client�� ����

				// System.out.println("���� ��:" + s);//�Է¹��� ���� ���
			}
		} catch (Exception ignored) {

		} finally {
			try {
				socket.close();
			} catch (IOException ignored) {
			}
		}
	}

}