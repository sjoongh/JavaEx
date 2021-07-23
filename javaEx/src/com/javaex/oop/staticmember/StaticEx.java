package com.javaex.oop.staticmember;

public class StaticEx {
	public static int refCount; // 클래스 변수
	public static String classVar; // 클래스 변수, static붙으면 클래스
	public String instanceVar; // 인스턴스 변수, 없다면 인스턴스
	
	// static 영역의 초기화
	static {
		refCount = 0;
		classVar = "Static Member"; // OK
//		instanceVar = "Instance Member"; // fail, static -> 인스턴스 접근 불가
		System.out.println("Static Block");
	}
	// 생성자
	public StaticEx() {
		refCount++; // 생성자가 수행될때 참조 카운트 증가
		System.out.println("Instance Created!");
		System.out.println("현재 참조 카운트:"+refCount);
	}// 생성자는 클래스 이름과 같아야함
	
	// 소멸자(특별한 경우가 아니면 사용x)
	@Override
	protected void finalize() throws Throwable {
		refCount--;
		super.finalize();
		System.out.println("소멸자 호출");
	}
}
