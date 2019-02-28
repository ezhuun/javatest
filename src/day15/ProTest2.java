package day15;

import java.io.FileInputStream;
import java.util.*;

public class ProTest2 {
	public static void main(String[] args) {
		String myinfoPath = "myinfo.properties";

		Properties pro = new Properties();
		try {
			FileInputStream fis = new FileInputStream(myinfoPath);
			pro.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}


		Iterator iter = pro.keySet().iterator();
		while(iter.hasNext()) {
			String key = (String)iter.next();
			System.out.println(pro.getProperty(key));
		}

	}
}