package day04;

public class ArrayWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] movies = { "�׷���Ƽ", "���� �̾�", "���������", "������ ����� ������ �ȴ�.", "���" };
		int[] years = { 2014, 2008, 2012, 2013, 2014 };

		int cnt = -1;

		System.out.println("�迭�� ���� ����: " + movies.length); // 5
		while (cnt < movies.length - 1) {
			cnt = cnt + 1;
			System.out.println(movies[cnt] + " - " + years[cnt]); 
		}
		
		for(int i=-1; i<5; i++) {
			i = i + 1;
			System.out.println(movies[i] + " - " + years[i]); 
		}
			
	}

}
