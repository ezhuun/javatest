package coding.day11;

import java.util.*;

//5번
public class IteratorExample {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();

		a.add("Hello");
		a.add(3);
		a.add(3.14);
		a.add(2, 3.4);

		Iterator i = a.iterator();
		
		while (i.hasNext()) {
			Object obj = i.next();
			if (obj instanceof String) {
				String str = (String) obj;
				System.out.println("(String)" + str);
			} else if (obj instanceof Integer) {
				int n = (Integer) obj; // 다운캐스팅, 오토언박싱 
				System.out.println("(Integer)" + n);
			} else if (obj instanceof Double) {
				double d = (Double) obj;
				System.out.println("(Double)" + d);
			}
		}
	}

}
