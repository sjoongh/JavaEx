package com.javaex.quiz02;

public class Quiz02_2 {

	public static void main(String[] args) {
		int balls = 136;
		int cap = 10;
		String result;
		
		result = balls / cap == 13 ? "14":"False";
		System.out.println(result);
		
//		int cnt = balls / cap;
//		cnt += (balls % cap > 0 ? 1: 0);
//		System.out.println(cnt);
	}

}
