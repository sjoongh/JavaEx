package com.javaex.practice01;
import java.util.Scanner;

public class practice01_1 {

	public static void main(String[] args) {
//		Problem01();
//		Problem02();
//		Problem03();
		Problem04();
//		Problem05();
	}

	
	private static void Problem01() {
		int i = 1;
		
		while (i <= 100) {
			if ((i % 5 == 0) && (i % 7 == 0))
				System.out.println(i);
			i++;
		}
	}

	
	private static void Problem02() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.print('\n');
		}
		}
	private static void Problem03() {
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		while (i <= 9) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+" ");
			}
			System.out.println();
			i++;
		}
}
	private static void Problem04() {
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		
		for (i = 1; i <= 10; i++) {
			for (int j = 0+i; j < 10+i; j++) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
	private static void Problem05() {
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int result = 0;
		
		System.out.println("숫자를 입력하세요");
		
		while (i < 5) {
			System.out.print("숫자: ");
			int num = sc.nextInt();
			if (result < num)
				result = num;
			i++;
		}
		System.out.println("최대값은 "+result+"입니다");
	}
}

