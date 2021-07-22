package com.javaex.oop.goods.v4;

// v4 this
// 객체 자신을 의미, this() 내부의 다른 생성자를 의미
public class Goods {
	// 필드 선언
	private String name;
	private int price;
	
	// 생성자
	public Goods(String name) { // name 필드만 초기화 하는 생성자
		this.name = name;
	}
	
	public Goods(String name, int price) {
		this(name); // 내부의 다른 생성자 호출
		// new Goods "이름" -> this(name) -> this.name = name -> this(name)
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
