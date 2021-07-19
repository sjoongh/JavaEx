package com.javaex.basics;

public class OperatorEx {

	public static void main(String[] args) {
		arithOperEx();
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
