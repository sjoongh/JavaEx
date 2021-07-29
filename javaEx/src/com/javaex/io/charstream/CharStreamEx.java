package com.javaex.io.charstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String filename = rootPath + "char.txt";
	public static void main(String[] args) {
//		writeTest();
		readTest();
	}
	
	private static void readTest() {
		Reader freader = null;
		
		try {
			freader = new FileReader(filename);
			
			int data = 0;
			while((data = freader.read()) != -1) {
				//  char로 캐스팅 안하면 아스키 코드(int)값으로 출력됨
				System.out.print((char)data);
			}
			
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				freader.close();
			} catch (Exception e) {
				
			}
		}
	}

	private static void writeTest() {
		Writer fwriter = null; // 캐릭터 기반 출력 스트림의 최고 조상
		
		try {
			// 출력 스트림 생성
			fwriter = new FileWriter(filename,  // 파일명
					true); // true => 기존파일에 새롭게 추가(append)
			
			// 기록
			fwriter.write("Bit computer\r\n");
			fwriter.write("Java Programming\r\n");
			fwriter.write("2021.07\r\n");
			fwriter.flush(); // 버퍼 비우기
			
			System.out.println("파일을 기록했습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fwriter.close();
			} catch(Exception e) {
				
			}
		}
	}
}
