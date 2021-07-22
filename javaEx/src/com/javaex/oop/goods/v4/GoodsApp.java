package com.javaex.oop.goods.v4;

public class GoodsApp {

	public static void main(String[] args) {
//		Goods notebook = new Goods(); // 기본 생성자 없음 
		Goods notebook = new Goods("LG Gram", 1700000);
		// 필드에 접근
		// setter를 이용한 우회접근
//		notebook.setName("LG Gram");
//		notebook.setPrice(1700000);
		
		Goods smartphone = new Goods("iphone 12", 800000);
//		smartphone.setName("iphone 12");
//		smartphone.setPrice(800000);
		// 출력 1
		System.out.printf("%s, %d원%n",
				notebook.getName(),
				notebook.getPrice());
		System.out.printf("%s, %d원%n",
				smartphone.getName(),
				smartphone.getPrice());
		// 출력 2
		notebook.showInfo();
		smartphone.showInfo();
		
//		notebook.setPrice(170); // price 필드는 Read Only
//		notebook.showInfo();
	}

}
