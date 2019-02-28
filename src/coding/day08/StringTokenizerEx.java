package coding.day08;

//6¹ø
import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("È«±æµ¿/ÀåÈ­/È«·Ã/ÄáÁã/ÆÏÁã", "/"); // ±¸ºĞÀÚ·Î "/"»ç¿ë
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
