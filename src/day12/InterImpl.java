package day12;

public class InterImpl implements Inter {

	public static void main(String[] args) {
		InterImpl interImpl = new InterImpl();
		System.out.println(interImpl.add(10, 5));
		System.out.println(interImpl.sub(10, 5));

		Inter inter2 = new InterImpl();		//업카운팅
		System.out.println(inter2.add(100, 50));
		System.out.println(inter2.sub(100, 50));
	}

	@Override
	public int add(int i, int j) {
		return i + j;
	}

	@Override
	public int sub(int i, int j) {
		return i - j;
	}

}

interface Inter {
	public abstract int add(int i, int j);

	public int sub(int i, int j);
}