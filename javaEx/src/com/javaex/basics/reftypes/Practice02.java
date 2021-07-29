package com.javaex.basics.reftypes;
import java.util.*;
import java.util.Random; // 기본적으로 main문에는 있지만 public static 생성시에는 
// import 를 해줘야 동작함

public class Practice02 {

	public static void main(String[] args) {
		Problem01();
//		Problem02();
//		Problem03();
//		Problem04();
//		Problem05();
	}
	
	public static void Problem01() {
//		int data[] = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
//		int count = 0;
//		int sum = 0;
//		
//		for (int i = 0; i < data.length; i++) {
//			if (data[i] % 3 == 0) {
//				count += 1;
//				}
//			sum += data[i];
//		}
//		System.out.printf("주어진 배열에서 3의 배수의 개수 => %d%n", count);
//		System.out.printf("주어진 배열에서 3의 배수의 합 => %d", sum);
	}
	
	public static void Problem02() {
		Scanner sc = new Scanner(System.in);
		
		int x[] = {}; // 초기화
		int result = 0;

		// 배열 입력값 만큼 생성(int)
//		int y = sc.nextInt();
//		int x[] = new int[y];
		
		// 배열 입력값 만큼 생성(str)
//		String s = sc.next();
//		String[] strArray = new String[s.length()];
		
		for (int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			x[i] = num;
		}
		for (int j = 0; j < x.length; j++) {
			result += x[j];
		}
		System.out.printf("평균은 %.1f 입니다.", ((float)result / (float)5));
	}
	
	public static void Problem03() {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', 
				' ', 'a',' ','p','e','n','c','i','1'};
		for (int i = 0; i < 16; i++)
			if (c[i] == ' ')
				c[i] = ',';
		String newString = String.valueOf(c);
		System.out.println(c);
	}
	
	public static void Problem04() {
		int[] x;
		x = new int[6];
		
		int num2 = 0;
		
		Random num = new Random();
		for (int i = 0; i < 6; i++) {
			x[i] = num.nextInt(45);
		}
		for (int j = 0; j < x.length; j++)
			System.out.printf("%d  ", x[j]);
	}
	
	public static void Problem05() {
		int scoreboard[][] = {
			{ 80, 75, 90, 95, 78 },
			{ 92, 88, 89, 92, 70 },
			{ 78, 80, 85, 86, 63 },
			{ 83, 84, 89, 87, 75 },
			{ 89, 83, 93, 94, 78 }
		};
		int sum = 0; 
		int count = 0;
		
		for (int i = 1; i < scoreboard.length; i++) { 
			for (int j = 0; j < scoreboard.length; j++) {
				if (scoreboard[i][j] > 85) {
					sum += scoreboard[i][j];
					count += 1;
				}
			}
		}
		System.out.println(sum);
		System.out.printf("%.1f", (float)sum / (float)count);
	}
}

