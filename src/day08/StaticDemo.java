package day08;

public class StaticDemo {
	public static void main(String[] args) {
		
	}
}



class Box {
	int cnt = 0;
	static long boxID = 0;
	
	public Box() {
		boxID = boxID + 1; // static variable
		cnt = cnt + 1; // member variable
		System.out.println("멤버 변수		cnt : " + cnt);
		System.out.println("static 변수	BoxID : " + boxID);
	}
	
//	public void staticTest(){
//		static long count=0;
//		count=count+1;
//	}

//	public static void staticTest2(){
//		static long count = 0;
//		count=count+1;
//	}

}
