package com.javaex.oop.point.v1;

public class pointApp {
	public static void main(String[] args) {
		Point p1 = new Point();
		
		p1.setX(50);
		p1.setY(10);
		p1.draw();
		System.out.println(p1.getX()+"sdf");
		
		Point p2 = new Point();
		p2.setX(20);
		p2.setY(30);
		System.out.println(p2.getX()+"sdf");
		p2.draw();
	}
}
