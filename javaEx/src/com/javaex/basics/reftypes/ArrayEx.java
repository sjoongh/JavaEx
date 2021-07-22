package com.javaex.basics.reftypes;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
//		defineArray();
//		multiDimArray();
//		arrayCopyFor();
		arrayCopySystem();
	}
	
	private static void arrayCopySystem() {
		int source[] = { 1, 2, 3 };
		int target[] = new int[10];
		
		// 복사
		System.arraycopy(source, 0, target, 0, 0);
		// 	(원본배열, 시작인덱스, 타겟배열, 시작인덱스, 복사할길이)
		
		// 편리한 배열의 출력
//		System.out.println(source);
		System.out.println("원본:" + Arrays.toString(source));
		System.out.println("타겟:" + Arrays.toString(target));
		
	}
	
	private static void arrayCopyFor() {
		// 배열은 크기 변경 불가
		// 새 배열을 생성 복사
		int source[] = { 1, 2, 3 };
		int target[] = new int[10];
		
		// 복사
		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}
		
		// 소스 배열 출력
//		for (int i = 0; i < source.length; i++) {
//			System.out.print(source[i] + "\t");
//		}
//		System.out.println();
		
		// Enhanced FOR (향상된 FOR문)
		for (int i:source) {
			// 변수명 i로 사용
			System.out.print(i + '\t');
		}
		System.out.println();
		
		// 타겟 배열 출력
//		for (int i = 0; i < target.length; i++) {
//			System.out.print(target[i] + "\t");
//		}
//		System.out.println();
//	}
		for (int i:target) {
			System.out.print(i + '\t');
			}
		System.out.println();
// 왜 주석해도 두개 같이 안나옴?????? -> 내일 해결
	}
	
	private static void multiDimArray() {
		// 2차원 배열의 선언 초기화
		int[][] twoDim = new int[5][10]; // 10개 배열이 5행 연결된 구조
		
		//int table[][] 2차원 배열 선언
		int table[][] = {
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 }, // 0행
				{ 2, 3, 4, 5, 6, 7, 8, 9, 0, 1 }, // 1행
				{ 3, 4, 5, 6, 7, 8, 9, 0, 1, 2 }, // 2행
				{ 4, 5, 6, 7, 8, 9, 0, 1, 2, 3 }, // 3행
				{ 5, 6, 7, 8, 9, 0, 1, 2, 3, 4 }, // 4행
		}; // 5행 10열의 배열 선언 초기화
		
		System.out.println("table.length: " + table.length);
		// table의 인덱스 범위: 0 ~ table.length - 1
		System.out.println("talbe[2].length: " +table[2].length);
		// table[2] 인덱스 범위: 0 ~ table[2].length - 1
		
		// 루프를 돌려서 내부 요소의 총합을 구해보자
		int sum = 0;
		// 행루프
		for (int row = 0; row < table.length; row++) {
			// 열루프
			for (int col = 0; col < table[row].length; col++) {
				sum += table[row][col];
			}
		}
		
		System.out.println("총합: "+sum);
	}

	private static void defineArray() {
		// 선언
		String[] names; // 타입[] 식별자
		int scores[]; // 타입 식별자[]
		
		// 일반적인 초기화
		scores = new int[4]; // 사이즈 지정
		// 인덱스 접근
		// 범위: 0 ~ .length - 1
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 88;
//		scores[4] = 100; // 배열의 범위를 넘어감
		
		// 데이터 가지고 있다
		// 	-> 배열의 사이즈를 지정할 필요 없음
		names = new String[] {"홍길동", "임꺽정", "장길산", "전우치"};
		
		// 데이터를 가지고 있다, 선언과 동시에 초기화 할때
		float heights[] = { 175.3f, 180.5f, 190.2f, 165.2f };
		
		// .length : 배열의 길이
		System.out.println("names의 길이:" + names.length);
		
		// 인덱스는 0부터
		for (int i = 0; i < names.length; i++) {
			System.out.printf("%s (%.2f) : scores = %d%n",
					names[i], heights[i], scores[i]);
		}
		
		// 배열은 참조 타입이다
		int scores2[] = scores; 
		
		System.out.println("scores:" + Arrays.toString(scores));
		System.out.println("scores2" + Arrays.toString(scores2));
		
		scores2[2] = 100; // 참조 복사 : 객체를 복사한 것이 아니라 주소만 복사
						  // 		-> 때문에 메모리의 값을 변경시키면 원본의 값도 변경됨
		
		System.out.println("scores:" + Arrays.toString(scores));
		System.out.println("scores2" + Arrays.toString(scores2));
		
	}
}
