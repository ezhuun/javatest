package day07;

public class Block {
	String Block = "재밌는 영화";

	public static void main(String[] args) {
		String b1 = "트로이";
		System.out.println("Movie:" + b1);// 트로이

		{
			String b2 = "우주전쟁";
			System.out.println("Movie:" + b2);
			int i = 0;

			for (int j = 0; j < 5; j++) {
				// j는 이 블럭안에서만 유지됩니다
			}
			// System.out.println("j:"+j);

			for (i = 0; i < 5; i++) {
				// i는 외부에 선언되어 있어야 합니다
			}
			System.out.println("i:" + i);
		}

		System.out.println("Movie:" + b1);
		// error
		//System.out.println("Movie:"+b2);

	}
}
