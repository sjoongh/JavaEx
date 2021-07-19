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
	}

}
