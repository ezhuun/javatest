package coding.day06;

import java.util.Scanner;

public class GoodsArray {
	public static void main(String[] args) {

		Goods[] goodsArray;
		goodsArray = new Goods[3];
		
		for(int i=0; i<goodsArray.length; i++) {
			Scanner s = new Scanner(System.in);
			
			System.out.print("상품명:");
			String name = s.next();
			
			System.out.print("상품가격:");
			int price = s.nextInt();
			
			System.out.print("재고수량:");
			int n = s.nextInt();
			
			System.out.print("팔린수량:");
			int sold = s.nextInt();
			
			goodsArray[i] = new Goods(name, price, n, sold);
		}
		
		for(int i=0; i<goodsArray.length; i++) {
			System.out.println(goodsArray[i].getName()+"");
			System.out.println(goodsArray[i].getPrice()+"");
			System.out.println(goodsArray[i].getNumberOfStock()+"");
			System.out.println(goodsArray[i].getSold()+"");
		}
		
	}
}

class Goods {
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;

	//생성자-필드(멤버변수)의 초기화
	Goods(String name, int price, int numberOfStock, int sold) {
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}
	
	String getName() {
		return this.name;
	}
	int getPrice() {
		return this.price;
	}
	int getNumberOfStock() {
		return this.numberOfStock;
	}
	int getSold() {
		return this.sold;
	}
}
