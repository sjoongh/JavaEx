package com.javaex.api.objectclass.v1;

public class LangClassTest {

	public static void main(String[] args) {
		Point p = new Point(10, 20);
		// Point는 Object클래스의 모든 메서드를 사용 가능
		System.out.println(p.getClass().getSimpleName());
		System.out.println(p.hashCode());
		System.out.println(p.toString()); // 객체의 정보(다른타입)를 문자열로 반환
		System.out.println(p); // p.toString()
		
		// p의 부모 객체를 확인
		System.out.println("p의 부모:"+
		p.getClass().getSuperclass().getName());
	}

}
