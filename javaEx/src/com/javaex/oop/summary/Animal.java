package com.javaex.oop.summary;

public abstract class Animal {
	// 필드
	protected String name;
	protected int age;
	
	public Animal(String name) {
		this.name = name;
	}
	public Animal(String name, int age) {
		// 자신의 다른 생성자 호출
		this(name);
		this.age=age;
	}
	
	// 일반메서드
	public void eat() {
		System.out.println(name+" is eating...");
	}
	
	// 추상메서도 : 선언만 한다
	// 자식 클래스에서 Override해야 한다
	public abstract void say();
}
