package com.javaex.oop.staticmember;

public class Singleton {
	// static 멤버
	private static Singleton instance = new Singleton();
	
	// 생성자
	private Singleton() {
		// 외부에서 new로 인스턴스 생성 불가
	}
	
	// static 필드로 접근 할 수 있게 getter사용
	public static Singleton getInstance() {
		return instance; // 객체를 얻고 instance로 반환
	}
}
