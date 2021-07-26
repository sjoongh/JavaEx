package com.javaex.oop.summary;

public class KungfuPanda extends Panda implements KungfuSkill {
	// 생성자
	public KungfuPanda(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void kungfu() {
		System.out.println(name+": 아뵤~");
	}

}
