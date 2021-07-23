package com.javaex.oop.point.v4;

// 상속 : extends
public class ColorPoint extends Point {
	// 생성자 선언 x, 오류 발생 -> java에서 자동으로 기본생성자 선택 
	// -> super()로 부모의 기본 생성자 선택함
	
	// 추가 필드
	private String color;
	
	// 생성자
	public ColorPoint(int x, int y, String color) {
		// 명시적으로 부모 생성자 선택
		// 부모의 기본 생성자가 없다면 오류 발생
		super(x, y);
		this.color = color;
	}
	
	// getter / setter
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	// 메서드 오버라이드
	@Override
	// 메소드 이름이 다르다면 @override가 부모클래스에 같은 메소드가 있는지 확인
	public void draw() { // 물려 받았으나 자신만의 새로운 기능 덮어쓰기
		// 방법1. 부모의 getter, setter를 이용
		System.out.printf("색깔점[x=%d, y=%d, color=%s]을 그렸습니다.%n", 
				super.getX(), super.getY(), color);
		
		// 방법2. 부모의 필드를 protected로 변경
		System.out.printf("색깔점[x=%d, y=%d, color=%s]을 그렸습니다.%n",
				x, y, color);
	}
	
	// TODO: Point 클래스의 draw(boolean) 메서드를 오버라이드 해보기
}
