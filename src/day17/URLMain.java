package day17;

import java.io.*;
import java.net.*;

public class URLMain {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.naver.com");
		System.out.println("Port	 : " + url.getPort());
		System.out.println("Protocol : " + url.getProtocol());
		System.out.println("HostName : " + url.getHost());
		System.out.println("File	 : " + url.getFile());
		System.out.println("Ref	 : " + url.getRef());

		String temp;
		BufferedReader br;

		br = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
		while ((temp = br.readLine()) != null) {
			System.out.println(temp);
		}
		br.close();
	}
}
