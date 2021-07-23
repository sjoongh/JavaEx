package com.javaex.oop.staticmember;

public class SingletonApp {

	public static void main(String[] args) {
//		Singleton s = new Singleton(); // 생성자가 private라서 실행x
		Singleton s1 = Singleton.getInstance(); // 유일한 인스턴스 반환
		Singleton s2 = Singleton.getInstance();
		
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		
		// s1과 s2가 같은 객체인지
		System.out.println("s1 == s2 "+(s1==s2));
		System.out.println("s1 == s2 "+s1.equals(s2));
	}

}
