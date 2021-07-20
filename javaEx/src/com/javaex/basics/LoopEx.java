package com.javaex.basics;
import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
//		whileEx();
//		whileGugu();
//		doWhileEx();
//		forGugu();
//		continueEx();
//		test1();
		test2();
	}
	
	private static void test2() {
		Scanner sc = new Scanner(System.in);
		int star = sc.nextInt();
		
		for (int i = 1; i <= star; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print('*');
			}
			System.out.print('\n');
		}
	}
	
	private static void test1() {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++)
				System.out.println(i+"*"+j+"="+(i*j));
		}
	}
	
	private static void continueEx() {
		for (int i = 1; i <= 20; i++) {
			// 2의 배수, 3의 배수는 출력하지 않음
			if (i % 2 == 0 || i % 3 == 0)
				continue;
			System.out.println(i);
		}
	}
	
	private static void forGugu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력하세요");
		int dan = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan+"*"+i+"="+(dan * i));
		}
		sc.close();
	}
	
	private static void doWhileEx() {
		// 적어도 한번은 수행되어야 하는 반복,
		// 반복 조건이 반복문 내부에서 할당되는 경우
		Scanner sc = new Scanner(System.in);
		
		int total = 0, value = 0;
		
		do {
			System.out.println("숫자를 입력하세요.[0이면 종료]");
			value = sc.nextInt();
			total += value;
		} while(value != 0);
		
		System.out.println("합계:"+total);
		sc.close();
	}
	
	private static void whileGugu() {
		Scanner sc = new Scanner(System.in);
		
		int dan, i = 1;
		int x = 0;
		
		System.out.println("단을 입력하세요");
		System.out.println("단:");
		dan = sc.nextInt();
		
		while(i <= 9) {
			System.out.println(dan+ "*"+i+"="+(dan * i));
			i++;
		}
		sc.close();
	}
	private static void whileEx() {
		int num = 0;
		
		while(num <= 9) {
			System.out.println("I Like java" + num);
			num++;
		}
	}

}
