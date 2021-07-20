package com.javaex.basics;

import java.util.Scanner; // java.util 패키지의 Scanner 로드

public class ConsoleEx {

	public static void main(String[] args) {
//		consoleOutputEx();
//		consoleInputEx();
		consoleInputPractice();
	}
	
	private static void consoleInputPractice() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력해 주세요");
		System.out.print("이름:");
		String name = scanner.next();
		System.out.print("나이:");
		String age = scanner.next();
		System.out.println("당신의 이름은 "+name+", 나이는 "+age+"입니다.");
		
		scanner.close();
	
//		String input = in.nextLine().toLowerCase();
//
//			// 숫자가 아니면 빈칸으로
//	        input = input.replaceAll("[^0-9]", "");
//
//			// 인트로 변환
//	        int result = Integer.parseInt(input);
//	        System.out.println(result);
	}
	
	private static void consoleInputEx() {
		// 표준 입력 stdin -> System.in
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		System.out.print("이름:");
		
		String name = scanner.next();
		System.out.println("당신의 이름은 "+name+"입니다");
		
		// 중요: 시스템 자원을 사용하는 클래스는 사용 이후에 반드시 닫아주자
		scanner.close();
	}
	
	private static void consoleOutputEx() {
		// 표준 출력 : stdout -> System.out
		// 표준 에러 : stderr -> System.err
		
		// 출력 메서드
		//	print: 개행 안함
		//	println: 개행 한다
		//	printf: 형식화된 출력 -> String
		
		System.out.print("Hello "); // 개행안한다
		System.out.println("Java"); // 개행 한다
		
		// 이스케이프 문자 (\) - 특수한 문자를 지닌 문자
		System.out.println("Hello\tJava"); // \t -> 탭
		System.out.println("Hello\nJava"); // \n -> 개행
		
		String message = "Hello, \"Java\"";
		System.out.println(message);
		
//		// \\ -> \
		String path = "C:\\Users\\bit\\Document";
		System.out.println(path);
		
		System.err.println("표준 에러 출력!");
	}
}
