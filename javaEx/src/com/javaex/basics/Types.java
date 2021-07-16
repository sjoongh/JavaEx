package com.javaex.basics;

public class Types {
	static final int SPEED_LIMIT = 120;
	public static void main(String[] args) {
//		varEx();
//		intergerEx();
//		floatDoubleEx();
//		booleanEx();
//		charEx();
//		constantEx();
//		promotionEx();
		castingEx();
	}
	
	// 명시적 형변환(casting)
	private static void castingEx() {
		// 표현 범위가 넓은 자료형 -> 좁은 자료형으로 변환
		// 강제로 타입 변환을 수행, 자료의 유실이 발생할수도
		float f = 1234567890.123456789F;
		System.out.println(f); // 4byte 실수형
		
		long l = (long)f; // 8byte 정수형 -> 소수점 자료의 유실 발생
		System.out.println(l);
		
		int i = (int)l; // 4byte 정수형
		System.out.println(Integer.toBinaryString(i));
		
		short s = (short)i;
		System.out.println(Integer.toBinaryString(s));
		
	}
	
	// 암묵적 형변환(promotion)
	private static void promotionEx() {
		// byte < short < int < long | float < double
		// 표현 범위 좁은 자료형 -> 넓은 자료형으로
		// 자동 변환 수행
		byte b = 25; // 1byte 정수형
		System.out.println(b);
		
		short s = b; // 2byte 정수형
		System.out.println(s);
		
		int i = s; // 4byte 정수형
		System.out.println(i);
		
		long l = i; // 8byte 정수형
		System.out.println(l);
		
		float f = l; // 4byte 실수형
		// 바이트 수는 적지만, 표현 범위가 더 넓다
		System.out.println(f);
		
		double d = f;
		System.out.println(d);
	}
	
	// 상수
	private static void constantEx() {
		int SPEED_LIMIT = 120;
		
		System.out.println("제한속도:" + SPEED_LIMIT);
		System.out.println("현재 도로의 제한 속도는 "+SPEED_LIMIT+"입니다.");
		
//		SPEED_LIMIT = 160; // 변경 시도 불가(final)
		System.out.println("제한속도:" + SPEED_LIMIT);
		System.out.println("현재 도로의 제한 속도는 "+SPEED_LIMIT+"입니다.");
		
	}
	
	// 문자형 데이터 타입
	private static void charEx() {
		char ch1 ='A';
		char ch2 = '한';
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		System.out.println(ch1 + ch2);
		
		String str ="A한";
		System.out.println(str);
	}
	
	// 논리형 데이터 타입
	private static void booleanEx() {
		// 1byte: true or false
		// 조건 분기, 반복문 등에 활용 -> 중요
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		// 비교 연산, 논리 연산의 결과로 활용
		int a = 7, b = 3;
		boolean result = (a > b);
		
		System.out.println(result);
		
	}
	// 실수형 데이터 타입
	private static void floatDoubleEx() {
		// float(4)뒤에는 f < double(8)
		float  floatVar = 3.14159f; // f or F
		double doubleVar = 3.14159;
		
		System.out.println(floatVar);
		System.out.println(doubleVar);
		
		// 지수 표기법, E or e == 제곱
		doubleVar = 3E10; // 3 * 10 ^ 10
		floatVar = 3e-6f; // 3 * 10 ^ - 6
		
		System.out.println(doubleVar);
		System.out.println(floatVar);
		
		// 부동소수점 계산의 문제
		// floatm double은 정밀도를 포기하고
		// 표현 범위를 넓히 것
		// 정밀 실수 처리에는 적합하지 않다
		System.out.println(0.1 * 3);
	}
	// 정수형 데이터 타입
	private static void intergerEx() {
		// byte(1) < short(2) < int(4) < long(8)뒤에는 L
		int intVar1, intVar2;
		
		intVar1 = 2021;
		System.out.println(Integer.toBinaryString(intVar1));
		
		long longVar1, longVar2;
		longVar1 = 2021;
		longVar2 = 1234567890123L;
		
		System.out.println(longVar1);
		System.out.println(longVar2);
		
		int bin, oct, hex;
		
		bin = 0b1101; // 2진수 앞 -> 0b(두자리)
		oct = 072; // 8진수 앞 -> 0(한자리)
		hex = 0xFF; // 16진수 앞 -> 0x(두자리)
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
	}
	private static void varEx() {
		
	}
}
