package com.javaex.api.arrays;

import java.util.*;

public class ArraysEx {

	public static void main(String[] args) {
//		arrayCopyEx();
//		basicSortTest();
//		basicSortDescTest();
//		customClassSortTest();
//		basicSearchEx();
		searchCustom();
	}
	
	// 검색(사용자 정의 클래스)
	private static void searchCustom() {
		Member members[] = {
				new Member("홍길동"),
				new Member("고길동"),
				new Member("장길산"),
				new Member("임꺽정"),
				new Member("전우치")
		};
		Arrays.sort(members);
		System.out.println("정렬된 배열:"+Arrays.toString(members));
		
		System.out.println(Arrays.binarySearch(members, 
				new Member("홍길동"),
				new Comparator<Member>() {
			@Override
			public int compare(Member o1, Member o2) {
				return o1.name.compareTo(o2.name);
			}
		}));
	}
	
	// 검색(기본타입)
	private static void basicSearchEx() {
		// 자바는 이진 검색 방식을 사용한다
		int nums[] = { 5, 3, 1, 7, 8, 6, 4, 9, 2 };
		// 이진 탐색은 탐색 이전에 미리 오름차순 정렬이 되어 있어야한다
		Arrays.sort(nums);
		System.out.println("정렬된 배열:"+Arrays.toString(nums));
		int idx = Arrays.binarySearch(nums, 1);
		System.out.println("1의 인덱스:" + idx);
		
		String str[] = {"Java", "C", "C++", "Python", "Linux"};
		System.out.println("원본 배열:"+Arrays.toString(str));
		Arrays.sort(str);
		System.out.println("정렬된 배열:" + Arrays.toString(str));
		idx = Arrays.binarySearch(str, "Java");
		System.out.println("Java의 인덱스:"+idx);
	}
	
	// 사용자 정의 클래스에 정렬
	private static void customClassSortTest() {
		Member members[] = {
				new Member("홍길동"),
				new Member("고길동"),
				new Member("장길산"),
				new Member("임꺽정"),
				new Member("전우치")
		};
		System.out.println("원본:"+Arrays.toString(members));
//		Arrays.sort(members); // 오름차순 정렬
		Arrays.sort(members, Collections.reverseOrder()); // 내림차순 정렬
		System.out.println("정렬:"+Arrays.toString(members));
	}
	// 정렬(기본 타입의 정렬)
	private static void basicSortTest() {
		int scores[] = {80, 50, 30, 90, 75, 88, 77};
		
		System.out.println("배열 원본:"+Arrays.toString(scores));
		Arrays.sort(scores); // 기본 정렬 : 오름차순
		System.out.println("기본 정렬(오름차순)"+Arrays.toString(scores));

	}
	// 정렬(기본 타입의 역순 정렬)
	private static void basicSortDescTest() {
		Integer scores[] = {80, 50, 30, 90, 75, 88, 77};
		System.out.println("배열 원본"+Arrays.toString(scores));
		Arrays.sort(scores, Collections.reverseOrder());
		System.out.println("기본 정렬(내림차순):"+Arrays.toString(scores));
	}
	// 복사
	private static void arrayCopyEx() {
		char[] src = "Java Programming".toUpperCase()
				.toCharArray();
		System.out.println(Arrays.toString(src));
		
		// 방법 1. 루프 돌며 복사
		char[] target = new char[src.length];
		for (int i = 0; i <src.length; i++) {
			target[i] = src[i];
		}
		System.out.println("루프복사:"+Arrays.toString(target));
		
		// 방법 2. System.arrayCopy
		target = new char[src.length];
		System.arraycopy(src, // 원본 배열
				0, // 복사 시작 위치(원본 배열)
				target, // 복사 대상 배열
				0, // 복사 시작 위치(대상 배열)
				src.length); // 복사 길이
		System.out.println("System 복사:"+Arrays.toString(target));
		
		// 방법 3. Arrays.copyOf
		target = Arrays.copyOf(src, // 원본 배열 
				src.length); // 복사할 길이 
		System.out.println("copyOf 복사 : "+Arrays.toString(target));
		
		// 방법 4. Arrays.copyOfRange
		target = Arrays.copyOfRange(src, // 원본 배열
				5, // 복사 시작 인덱스
				src.length);
		System.out.println("copyOfRange 복사:"+Arrays.toString(target));
		
		
		
	}

}
