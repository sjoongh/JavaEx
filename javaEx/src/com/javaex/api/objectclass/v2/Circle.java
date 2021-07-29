package com.javaex.api.objectclass.v2;

public class Circle {
	// 필드
	private int x;
	private int y;
	private int radius;
	
	// 생성자
	public Circle(int x, int y, int radius) {
		// 초기화(외부 전달값을 내부의 변수에 초기화)
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			// 캐스팅
			Circle other = (Circle)obj;
			return radius == other.radius;
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Circle x = "+x+"y = "+y;
	}
	
}
