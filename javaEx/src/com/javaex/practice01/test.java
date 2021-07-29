package com.javaex.practice01;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = 1;
		
		if (B >= C) {
			System.out.println("-1");
		}
		X = A / (C - B) + 1;
		System.out.println(X);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		if (N < 0) {
			N *= -1;
			System.out.println(M+N);
		}
		else if (M < 0) {
			M *= -1;
			System.out.println(N+M);
		}
		else if ((N < 0) && (M < 0)) {
			N *= -1;
			M *= -1;
			if (N > M)
				System.out.println(N-M);
			else
				System.out.println(M-N);
		}
}
}
