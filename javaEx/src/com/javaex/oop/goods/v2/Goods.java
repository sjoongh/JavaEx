package com.javaex.oop.goods.v2;

// v2. 접근 제한자
//		getter / setter를 통한 내부 필드의 우회 접근
// 1) 필드접근자를 private로 작성해서 외부에서 접근할 수 없게 합니다.
// 2) 필드에 값을 저장할 수 있도록 set메소드를 만드세요.
// 3) 필드에 값을 읽을 수 있도록 get메소드를 만드세요.
// 4) 아래와 같이 상품의 모든 정보를 출력해 주는 showInfo()를 만드세요.
public class Goods {
	// 필드 선언
	private String name;
	private int price;
	
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
	// setters
	public void setPrice(int price) {
		this.price = price;
	}
	
	// 메서드
	public void showInfo() {
		System.out.println("상품이름:"+name);
		System.out.println("가격:"+price);
	}
}
