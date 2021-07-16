package com.javaex.basics;

public class Types {

	public static void main(String[] args) {
		varEx();
		intergerEx();
	}
	private static void intergerEx() {
		// byte(1) < short(2) < int(4) < long(8)
		int intVar1, intVar2;
		
		intVar1 = 2021;
		System.out.println(Integer.toBinaryString(intVar1));
		
		long longVar1, longVar2;
		longVar1 = 2021;
		longVar2 = 1234567890123L;
		
		System.out.println(longVar1);
		System.out.println(longVar2);
		
		int bin, oct, hex;
		
		bin = 0b1101; // 2진수 앞 -> 0b(두자리)
		oct = 072; // 8진수 앞 -> 0(한자리)
		hex = 0xFF; // 16진수 앞 -> 0x(두자리)
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
	}
	private static void varEx() {
		
	}
}
