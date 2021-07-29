package com.javaex.api.stringclass;

public class StringEx {

	public static void main(String[] args) {
//		stringBasicEx();
//		stringMethodsEx();
		stringBufferEx();
	}
	
	private static void stringBufferEx() {
		// String 객체는 불변자료형(immutable)
		// StringBuffer 객체는 버퍼 기반의 가변 자료형
		StringBuffer sb = new StringBuffer("This"); // 기본버퍼(10)가진
		sb.append(" is pencil"); // append는 맨 뒤에 추가
		sb.insert(8, "my "); // 중간삽입
		sb.replace(8,  10, "your"); // 치환
		System.out.println(sb);
		
		sb.setLength(10); // 버퍼 크기를 강제 변경
		System.out.println(sb);
		
		String s = new StringBuffer("This")
				.append(" is pencil")
				.insert(8, "my ")
				.replace(8, 10, "your")
				.toString();
		System.out.println("메서드 체이닝:"+s);
	}
	
	private static void stringMethodsEx() {
		// 유용한 메서드들
		String str = "Java Programming, JavaScript Programming";
		
		// 변환 메서드
		System.out.println(str.toUpperCase()); // 모두 대문자로
		System.out.println(str.toLowerCase()); // 모두 소문자로
		// String은 불변객체(내부 내용이 변경되지 않음)
		System.out.println("원본 "+str);
		
		// 인덱스 관련(문자열 길이, 치환)
		System.out.println("LENGTH:"+str.length()); // 길이
		System.out.println("char @ 5:"+str.charAt(5)); // 인덱스 접근
		
		// 검색 관련(문자의 위치)
		System.out.println("str contains Java ? "+str.contains("Java"));
		int idx = str.indexOf("Java"); // 0부터 Java검색
		System.out.println("1st index of Java : "+idx);
		idx = str.indexOf("Java", 4); // 4부터 Java검색
		System.out.println("2nd index of Java : "+ idx);
		idx = str.indexOf("Java", idx+4); // 시작 인덱스 뒤로 밀기
		System.out.println("3rd inde of Java : "+idx);
		// 더이상 검색이 없으면 -1
		idx = str.lastIndexOf("Java"); // 역방향검색
		System.out.println("역방향 검색 : "+idx);
		
		// 문자열 추출
		System.out.println("substring 5 ~:"+str.substring(5)); // 끝까지
		System.out.println("substring 5 ~ 16:"+str.substring(5, 16));
		
		// 치환
		System.out.println(str.replace("Java", "C")); // Java -> C
		
		// 화이트 스페이스 제거
		String s2 = "               Hello              ";
		String s3 =  ", Java";
		
		System.out.println(s2.trim()+s3);
		
		// 구분자로 분절
//		String[] split = str.split(" "); // 공백 문자를 기준, 문자열 분절
		String[] split = str.toUpperCase().replace(",","").split(" ");
		for (String word: split) {
			System.out.println("WORD:"+word);
		}
		
		// 문자열 비교(중요) : Unicode의 비교
		System.out.println("ABC".compareTo("ABE"));
		// == 0 : 순서가 같다
		// < 0 : 순서가 앞이다
		// > 0 : 순서가 뒤이다
	}
	
	private static void stringBasicEx() {
		String s1 = "Java"; // 리터럴
		String s2 = new String("Java"); // 새 객체 생성
		String s3 = "Java"; // 리터럴
		
		// 리터럴 문자열은 값이 같으면 같은 객
		System.out.println("s1 == s2 ? "+(s1 == s3));
		System.out.println("s1 == s2 ? "+(s1 == s2));
		
		// 문자열 내부에 char의 연속된 데이터
		String s4 = new String(new char[] { 'J', 'a', 'v', 'a' });
		System.out.println("s4 => "+s4);
		
		// 기본 데이터 타입을 문자열로 변환할 경우
		String s5 = String.valueOf(Math.PI);
		System.out.println("s5 => "+s5);
	}

}
