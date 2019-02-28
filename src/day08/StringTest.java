package day08;

public class StringTest {

	public String changeString(String src) {
		src = "JSP";
		return src;
	}
	
	public static void main(String[] args) {
		String step = "JAVA";
		StringTest st = new StringTest();
		
		
		System.out.println(step);
		step = st.changeString(step);
		System.out.println(step);

	}
}