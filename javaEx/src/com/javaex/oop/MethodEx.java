package com.javaex.oop;

public class MethodEx {

	public static void main(String[] args) {
		// 메서드 호출
//		printMessage();
//		printMessage("Hello, Method");
//		printDivide(10, 0);
//		System.out.println(divide(10, 3)); // 정수가 넘어감
		System.out.println("getSum:"+ getSum(new double[] {
				1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		}));
		System.out.println("getSumVar:"+
		getSumVar(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		printSum("고정+가변:", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	}
	
	// 고정인수가 앞에, 가변인수가 뒤에
	private static void printSum(String message, double ...values) {
		System.out.println(message+":"+getSumVar(values));
	}
	
	// 매개변수의 개수를 모른다
	// 방법2. 가변인수: 이름 앞에 ...
	private static double getSumVar(double ...values) {
		// 가변인수는 배열로 변환되어 돌아온다
//		double total = 0;
//		
//		for (double value: values) {
//			total += value;
//		}
//		return total;
		return getSum(values);
	}
	
	// 매개 변수의 개수를 모른다
	// 방법1. 인수를 배열로 전달
	private static double getSum(double[] values) {
		double total = 0;
		
		for (double value: values) {
			total += value;
		}
		return total;
	}
	
	// 입력 o , 출력 o
	private static double divide(double num1, double num2) {
		// int형은 double보다 표현 범위가 작기때문에 캐스팅(형변환)되서 반환됨
		return num1 / num2; // 3.3333~~
		// static double과 return type이 일치해야함
	}
	
	// 입력 o, 출력 x
	private static void printDivide(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("0으로 나눌 수 없어요!");
			return; // 돌아가세요!
		}
		System.out.println(num1 / num2);
	} 
	
	// 입력 o, 출력 x
	private static void printMessage(String message) {
		System.out.println(message);
	}
	
	// 입력 x, 출력도 없는 method
	private static void printMessage() {
		System.out.println("Hello, OOP");
	}
}
