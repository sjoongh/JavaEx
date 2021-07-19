package com.javaex.quiz02;

public class Quiz02_1 {

	public static void main(String[] args) {
		int a = 3;
		int b = 6;
		char c = 'A';
		String result;
		String r1;
		char r2;
		
		result = a % 2 == 0 ? "True":"False";
//		System.out.println(a % 2 == 0);
		System.out.println(result);
		
		result = b % 3 == 0 ? "True":"False";
		System.out.println(result);
		
		r1 = (a % 2 == 0) && (b % 3 == 0) ? "True":"False";
		System.out.println(r1);
//		boolean r1 = a % 2 == 0 && b % 3 == 0;
//		System.out.println(r1);

// 		char r2 = (char)(c + 4);
//		System.out.println(r2);
		r2 = c += 4;
		System.out.println(r2);
	}

}
