package com.javaex.oop.goods.v2;

public class GoodsApp {

	public static void main(String[] args) {
		Goods notebook = new Goods(); 
		// 필드에 접근
//		notebook.name = "LG Gram";
//		notebook.price = 1700000;
		// setter를 이용한 우회접근
		notebook.setName("LG Gram");
		notebook.setPrice(1700000);
		
		Goods smartphone = new Goods();
//		smartphone.name = "iPhone 12";
//		smartphone.price = 800000;
		smartphone.setName("iphone 12");
		smartphone.setPrice(800000);
		// 출력
		System.out.printf("%s, %d원%n",
//				notebook.name,
//				notebook.price);
				notebook.getName(),
				notebook.getPrice());
		System.out.printf("%s, %d원%n",
//				smartphone.name,
//				smartphone.price);
				smartphone.getName(),
				smartphone.getPrice());
		
		notebook.showInfo();
		smartphone.showInfo();
	}

}
