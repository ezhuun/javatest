package day02;


public class PointTest { //�ϳ��� ���Ͽ� Ŭ������ �ΰ� ������ �� �ִµ� 
						//main �Լ��� ������ �Ѱ����־����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point obj1 = new Point(10,20); //������ ȣ�� 
									  //�����ڸ� �ʱ�ȭ�ϱ� ���� ��ü ���� ->�޸��Ҵ� 
		Point obj2 = obj1;
		
		System.out.printf("obj1 =(%d, %d) %n", obj1.x,obj1.y);
		System.out.printf("obj2 =(%d, %d) %n", obj2.x,obj2.y);
		
		obj2.x=30;
		System.out.printf("obj1 =(%d, %d) %n", obj1.x,obj1.y);
		System.out.printf("obj2 =(%d, %d) %n", obj2.x,obj2.y);
		
		System.out.println("obj1:"+ obj1.hashCode());
		System.out.println("obj2:"+ obj2.hashCode());
	}

}
