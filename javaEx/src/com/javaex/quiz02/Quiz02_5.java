package com.javaex.quiz02;

public class Quiz02_5 {

	public static void main(String[] args) {
		int num1 = 13579;
		int num2 = 13579;
		
		num1 = ++num1 + 1;
		num2 = num2++ + 1;

		if (num1 == num2)
			System.out.println("같음");
		else
			System.out.println("다름");
		// 후위 연산자
		// num = 0;
		// result = num++ 일떄 num의 값은 1증가하지만 result의 값은 num값 그대로
		// System.out.println(result); -> 0
		// System.out.println(num); -> 1 이 된다
		// num = num++을 해도 마찬가지
	}

}
