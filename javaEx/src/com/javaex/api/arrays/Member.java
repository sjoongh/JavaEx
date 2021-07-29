package com.javaex.api.arrays;

// 선후 비교를 위해 Comparable 인터페이스 구현
public class Member implements Comparable<Object> {
	String name;
	
	Member(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Member) {
			// 리턴값이 0: 두 객체의 순서는 같다
			// 		음수: 순서가 앞이다
			//		양수: 순서가 뒤이다
			Member other = (Member)o;
			return name.compareTo(other.name);
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}
}
