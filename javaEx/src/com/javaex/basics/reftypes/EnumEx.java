package com.javaex.basics.reftypes;

import java.util.Arrays;

public class EnumEx {

	public static void main(String[] args) {
		enumEx1();
	}
	
	public static void enumEx1() {
		// Week enum(열거체)를 참조해서 today라는 객체를 만들어서 enumEx1에서 사용
		// 열거체 참조 방법 
		Week today = Week.SUNDAY;
		
		System.out.printf("오늘은 %s(%d) 입니다.%n",
		today.name(), // 열거 상수 -> 문자열
		today.ordinal()); // 열거 상수 내 순번
		
		Week obj = Week.valueOf("FRIDAY");
		
		System.out.printf("%s, %d%n", obj.name(), obj.ordinal());
		
		System.out.printf("%s와 %s의 순번차: %d%n", 
				today.name(), obj.name(), today.compareTo(obj));
		
		Week[] days = Week.values();
		
		System.out.println(Arrays.toString(days));
	}
}
