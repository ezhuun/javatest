package day04;

public class EvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0; 
		int sum2=0;
		for(int i=0; i<=100; i++)
		{
			if(i%2==0)
				sum+=i;
			else
				sum2+=i;
		}
		System.out.println("1~100���� ¦���� ��:"+sum);
		System.out.println("1~100���� Ȧ���� ��:"+sum2); 
	}

}
