package com.javaex.api.generic;

public class BoxApp {

	public static void main(String[] args) {
		IntegerBox iBox = new IntegerBox();
		iBox.setContent(2021);
		System.out.println("iBox:" + iBox.getContent());
		
		StringBox sBox = new StringBox();
		sBox.setContent("String Box");
		System.out.println("sBox:"+sBox.getContent());
		
		// 모든 객체를 담을 수 있는 상자
		// Object 타입을 담은 객체
		// 1. 캐스팅을 해야 한다는 불편함
		// 2. 캐스팅을 잘못 하면 심각한 예외 발생
		ObjectBox oBox = new ObjectBox();
		oBox.setContent(2021);
		
		Integer i = (Integer)oBox.getContent();
		System.out.println("content:"+i);
		
		oBox.setContent("String Obj");
		
		String s = (String)oBox.getContent();
//		Integer i2 = (Integer)oBox.getContent(); // 캐스팅 오류 -> 주의
		
		
	// Generic 상자
	//		: 설계시에 타입을 미정 상태로 두고
	//			인스턴스 생성시 실제 타입을 결정한다
	GenericBox<Integer> intBox = new GenericBox<Integer>();
	intBox.setContent(2021); // OK
//	intBox.setContent("String"); // 안됨: 타입이 Integer로 고정
	
	Integer i2 = intBox.getContent(); //	캐스팅 불필요
	GenericBox<String> strBox = new GenericBox<String>();
//	strBox.setContent(2021); // 안됨
	strBox.setContent("String"); // Ok
//	Integer i3 = strBox.getContent(); //	컴파일러가 타입을 체크할 수 있다
	String s2 = strBox.getContent();
	
	// 제너릭을 사용 장점:
	// 1. 여러 타입에 대응하는 단일 클래스를 설계할 수 있다.
	// 2. 타입 체크를 컴파일러에게 맡길 수 있다: 안전성 확보
	// 3. 불필요한 캐스팅을 피할 수 있다: 편리하다
	System.out.println("s2:"+s2);
	}
}
