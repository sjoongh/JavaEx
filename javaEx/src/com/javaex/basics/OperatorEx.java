package com.javaex.basics;

public class OperatorEx {

	public static void main(String[] args) {
//		arithOperEx();
//		logicOperEx();
		bitOperEx();
	}
	
	// 비트 연산자
	private static void bitOperEx() {
		// 하드웨어 제어, 이미지 처리 등
		// 미세하게 비트 단위 데이터 제어에 활용
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		
		System.out.println("b1: " + Integer.toBinaryString(b1));
		System.out.println("b2: " + Integer.toBinaryString(b2));
		
		int result = b1 & b2;// 비트 논리곱
		System.out.println("b1 & b2: " + Integer.toBinaryString(result));
		
		result = b1 | b2; // 비트 논리합
		System.out.println("b1 | b2: "+Integer.toBinaryString(result));
		
		result = ~b1; // 비트 논리 부정
		System.out.println("~b1: "+Integer.toBinaryString(result));
		
		result = b1 ^ b2; // 베타적 논리합
		System.out.println("b1 ^ b2: "+Integer.toBinaryString(result));
		
	}
	
	
	// 비교 연산과 논리 연산
	private static void logicOperEx() {
		int a = 7, b = 3;
		
		// 비교 연산자
		System.out.println("a > b ?" + (a > b));
		System.out.println("a와 b가 같습니까?" + (a == b));
		System.out.println("a와 b가 다릅니까?" + (a != b));
		
		// 논리 연산자: 논리곱(AND:&&), 논리합(OR: ||)
		int num = 5;
		
		// num: 0초과 10미만의 값인가?
		// 조건 1: num > 0
		// 조건 2: num < 10
		// 결과: 조건1 and 조건 2
		boolean r1 = num > 0;
		boolean r2 = num < 10;
		boolean r1Andr2 = r1 && r2;
		// num > 0 && num < 10
		System.out.println("r1 && r2 =>" + r1Andr2);
		
		// num: 0이하이거나 10이상인 값인가?
		// 조건1 = num <= 0 ?
		// 조건2 = num >= 10 ?
		// 결과: 조건1 or 조건2 (논리합: 합집합)
		boolean r3 = num <= 0;
		boolean r4 = num >= 10;
		boolean r3orr4 = r3 || r4;
		// num <= 0 || num >= 10
		System.out.println("r3 || r4 =>" + r3orr4);
		
		// 논리 부정:
		// num > 0 && num < 10 -> 논리 부정
		// -> num <= 0 || num >= 10
		
		boolean rNot = !(num > 0 && num < 10);
		System.out.println("num가 0초과, 10미만 이외의 값인가?" + rNot);
		
	}
	

	// 산술 연산
	private static void arithOperEx() {
		int a = 7, b = 3;
		
		// 부호 연산자: +, -
		System.out.println(-a);
		
		// 사칙연산
		System.out.println(a / b);
		System.out.println(a % b);
		
		// 실제 해 구하기
		System.out.println((float)a / (float)b);
		System.out.println((float)a / b);
		 
		// 전치증감
		int num = 10;
		System.out.println("num" + num);
		System.out.println("++num" + ++num);
		System.out.println("num" + num);
		
		// 후치증감
		System.out.println("num" + num);
		System.out.println("++num" + num++);
		System.out.println("num" + num);
		
		
		// System.out.println(4 / 0); // ArithmeticException
		System.out.println(4.0 / 0); // Infinity
		System.out.println(4.0 / 0 + 10); // Infinity가 포함된 연산 -> Infinity
		System.out.println(0.0 / 0.0); // NaN (Not a Number)
		
		// 연산 결과가 Infinity인지 확인
		System.out.println(Double.isInfinite(4.0 / 0));
		System.out.println(Double.isNaN(0.0 / 0.0));
		System.out.println("End of Code");
	}
}
