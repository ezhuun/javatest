package chatting;

import java.io.*;
import java.net.*;

public class ChatClientThread {
	private Socket socket = null;

	public void clientStart(String ip) {
		System.out.println("Ŭ���̾�Ʈ ���α׷� �۵�.....");
		try {
			socket = new Socket(ip, 2007);

			InetAddress ia = socket.getInetAddress();
			int local_port = socket.getLocalPort();// ���ӿ� ���� PORT
			int server_port = socket.getPort();// ���ӿ� ���� PORT
			String server_ip = ia.getHostAddress(); // ���� Client IP

			System.out.print("Ŭ���̾�Ʈ ����-Local Port: " + local_port);
			System.out.print(" Server IP: " + server_ip);
			System.out.println(" Server PORT: " + server_port);

			// �����͸� �о���� ������
			ChatClientReadHandler read = new ChatClientReadHandler(socket);
			read.start();
			// �����͸� ������ ������
			ChatClientSendHandler send = new ChatClientSendHandler(socket);
			send.start();

		} catch (IOException ioe) {
			System.err.println("������ �Ǿ� ���� �ʽ��ϴ�.");
		} finally {
			try {
				if (socket == null) {
					socket.close();
				}
			} catch (IOException ignored) {
			}
		}

	}

	public static void main(String[] args) {
		ChatClientThread cc = new ChatClientThread();
		cc.clientStart(args[0]);
	}
}


/**
 * �����͸� �о�ɴϴ�.
 * 
 * @author stu
 * 
 */
class ChatClientReadHandler extends Thread {
	private Socket socket;
	private String line; // �����κ��� �о�� ���ڿ� ����

	public ChatClientReadHandler() {
		System.out.println("���α׷��� �ʱ�ȭ ���� �ʾҽ��ϴ�.");
	}

	public ChatClientReadHandler(Socket socket) {
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

				System.out.println("\t\t\t������ : " + line);
				System.out.print("�� ");
			}
		} catch (IOException ignored) {
			System.err.println("������ �Ǿ� ���� �ʽ��ϴ�.");
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
class ChatClientSendHandler extends Thread {
	private Socket socket;
	private BufferedWriter writer;
	private BufferedReader in;
	private String s = "";

	public ChatClientSendHandler() {
		System.out.println("���α׷��� �ʱ�ȭ ���� �ʾҽ��ϴ�.");
	}

	public ChatClientSendHandler(Socket socket) {
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
				writer.flush();
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