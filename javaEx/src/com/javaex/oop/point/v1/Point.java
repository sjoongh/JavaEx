package com.javaex.oop.point.v1;

public class Point {
	// 필드
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = 60;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = 100;
	}
	
	public void draw() {
		System.out.printf(
				"점[x=%d, y=%d]을 그렸습니다.%n",
				x, y);
	}
}