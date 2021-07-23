package com.javaex.oop.staticmember;

public class StaticApp {
	// 1. static void 가 먼저 메모리에 올라감(static)
	// 2. StaticEx가 그 후 메모리에 올라감(생성자)
	// 3. 생성자가 메모리영역에 생성되었으므로 카운트
	public static void main(String[] args) {
		StaticEx s1 = new StaticEx(); // 인스턴스 생성
		System.out.println("참조 카운트:"+StaticEx.refCount);
		// static 멤버는 new로 인스턴스를 생성하지 않아도 접근 가능
		// 클래스이름.클래스(스태틱)변수명
		
		StaticEx s2 = new StaticEx();
		System.out.println("참조 카운트:"+s2.refCount);
		
		// 객체가 제거
		s1 = null; // 참조를 해제
		System.out.println("s1 해제");
		System.out.println("참조 카운트"+StaticEx.refCount);
		
		// 소멸자를 넣어서 null값을 만들어도 메모리에서 바로 사리지진 않는다
		System.gc();
		try {
			// 잠시 대기
			Thread.sleep(3000);
			System.out.println("참조 카운트:"+ StaticEx.refCount);
		} catch (Exception e) {
			
		}
	}

}
