package com.javaex.oop.Person;

public class PersonApp {

	public static void main(String[] args) {
		Person p = new Person("정우성", 45);
		Student s1 = new Student("서울고등학교");
		Student s2 = new Student("이정재", 45, "한국고등학교");
		
		p.showlnfo();
		s1.showlnfo2();
		s2.showlnfo();
	}

}
