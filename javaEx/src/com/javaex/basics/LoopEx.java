package com.javaex.basics;
import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
//		whileEx();
//		whileGugu();
		doWhileEx();
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
