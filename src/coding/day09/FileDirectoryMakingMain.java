package coding.day09;

import java.io.File;
import java.util.*;

public class FileDirectoryMakingMain {

	public static void main(String[] args) {
		FileDirectoryMaking fm = new FileDirectoryMaking();
				
		System.out.println("aaa ���丮 ����	: " + fm.make("aaa"));
		System.out.println("bbb ���丮 ����	: " + fm.make("bbb"));
		System.out.println("���丮�� ����	: " + fm.renameTo("aaa", "ccc"));
		System.out.println("���丮 ����	: " + fm.delete("ccc"));
		 
	}

}





class FileDirectoryMaking {
	public boolean make(String fname) {
		File f = new File(fname);
		
		if (f.isDirectory() && f.exists()) {
			System.out.println(fname + "�� �̹� ������");
			return false;
		}

		f.setLastModified(new Date().getTime());
		return f.mkdir();
	}

	public boolean renameTo(String fname, String newName) {
		File f = new File(fname);
		if (!f.exists()) {
			System.out.println(fname + "�� ����");
			return false;
		}
		f.setLastModified(new Date().getTime());
		return f.renameTo(new File(newName));
	}

	public boolean delete(String fname) {
		File f = new File(fname);
		if (!f.exists()) {
			System.out.println(fname + "�� ����");
			return false;
		}
		return f.delete();
	}
}