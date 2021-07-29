package com.javaex.oop.Person;

public class Person {
	protected String name;
	protected int age;

	public Person() {}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age = age;
	}
	
	public void showlnfo() {
		System.out.println(name+" "+age);
	}
}
