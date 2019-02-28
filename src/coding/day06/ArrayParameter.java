package coding.day06;

public class ArrayParameter {
	int i = 0;
	
	static void replaceSpace(char a[]) {
		for (int i = 0; i < a.length; i++) {
			a[i] = '-';
		}
	}
	
	static void printCharArray(char a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {		
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };

		printCharArray(c);		//출력용
		replaceSpace(c);		//배열 값 변경
		printCharArray(c);		//출력
	}

}
