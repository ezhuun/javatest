package day08;

public class Scjp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ScjpPass.BONUS : " + ScjpPass.BONUS);

		ScjpPass sp = new ScjpPass(85, 90, 80, 70);
		System.out.println("sp.t1 : " + sp.t1);

		//System.out.println("sp.BONUS : " + sp.BONUS);

	}

}

class ScjpPass {
	int t1 = 0;
	int t2 = 0;
	int t3 = 0;
	int t4 = 0;

	static int BONUS = 100;

	public ScjpPass() {
	}

	public ScjpPass(int t1, int t2, int t3, int t4) {
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
		this.t4 = t4;
	}
}