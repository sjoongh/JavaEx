package com.javaex.oop.goods.v3;

// v3. 생성자
//		: new 키워드와 함께 클래스를 객체화 시킬때 초기화
public class Goods {
	// 필드 선언
	private String name;
	private int price;
	
	// 생성자 규칙
	// 1. 생성자는 클래스 이름과 동일, 반환 타입 없음
	// 2. 생성자를 하나도 만들지 않으면 -> Javac(컴파일러)가 기본 생성자를 추가
	// 3. 생성자를 임의로 만들었을 때 -> Javac는 기본 생성자를 추가 하지 않음
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// getters 
	public String getName() {
		return name;
	}
	// setters 
	public void setName(String name) {
		this.name = name;
		// this.name = 자기자신 -> private String name
		// name = 전달받은 값 -> String name
	}
	// getters
	public int getPrice() {
		return price;
	}
	// setters를 구현하지 않으면 필드는 Read Only
	// setters
//	public void setPrice(int price) {
//		this.price = price;
//	}
	
	// 메서드
	public void showInfo() {
		System.out.println("상품이름:"+name);
		System.out.println("가격:"+price);
	}
}
