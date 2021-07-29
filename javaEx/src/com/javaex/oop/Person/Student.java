package com.javaex.oop.Person;

public class Student extends Person {
	
	public String school;
	
	public Student(String school) {
		super();
		this.school=school;
	}
	public Student(String name, int age, String school) {
		super(name, age);
		this.school=school;
	}
	public String getschool() {
		return school;
	}
	public void setschool(String school) {
		this.school=school;
	}
	
	public void showlnfo2() {
		System.out.println(school);
	}
	@Override
	public void showlnfo() {
		System.out.println(name+age+school);
}
}
