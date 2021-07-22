package com.javaex.oop.goods.v1;

public class GoodsApp {

	public static void main(String[] args) {
		// new Goods(); 가 Heap메모리에 들어감
		// new Goods()의 메모리 영역을 notebook이라는 변수에 할당
		// notebook 이라는 변수에 참조타입 Goods가 들어감
		// Goods 와 new Goods()의 차이는 무엇인가??
		Goods notebook = new Goods(); 
		// 필드에 접근
		notebook.name = "LG Gram";
		notebook.price = 1700000;
		
		Goods smartphone = new Goods();
		smartphone.name = "iPhone 12";
		smartphone.price = 800000;
		
		// 출력
		System.out.printf("%s, %d원%n",
				notebook.name,
				notebook.price);
		System.out.printf("%s, %d원%n",
				smartphone.name,
				smartphone.price);
	}

}
