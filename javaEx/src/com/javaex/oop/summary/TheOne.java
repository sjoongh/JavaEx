package com.javaex.oop.summary;

public class TheOne extends Human implements Flyable, KungfuSkill {
	
	// 생성자
	public TheOne(String name, int age) {
		super(name, age);
	}
	@Override
	public void kungfu() {
		System.out.println(name+": I know Kungfu");
	}

	@Override
	public void fly() {
		System.out.println(name+": I can fly");
	}

}
