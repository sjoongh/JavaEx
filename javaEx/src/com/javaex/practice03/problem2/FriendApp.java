package com.javaex.practice03.problem2;

import java.util.*;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");
        
        // 친구정보 입력받기 
        for (int i = 0; i < friendArray.length; i++) {
        	// 입력받은 친구정보를 공백으로 분리
        	String name = sc.next();
        	String hp = sc.next();
        	String school = sc.next();
        	// Friend 객체 생성하여 데이터 넣기
            // 배열에 추가하기
        	friendArray[i] = new Friend(name, hp, school);
        }
  
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
        	friendArray[i].showInfo();
            //친구정보 출력 메소드 호출
        }
        sc.close();
    }

}
