package day04;

public class ForSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(j=0,i=1; i<=10; i++) {
			j+=i;
			System.out.println(i);
			if(i==10) {
				System.out.println("=");
				System.out.println(j);
			}
			else
				System.out.println("+");
		}
	}

}
