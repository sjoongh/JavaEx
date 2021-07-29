package com.javaex.io.bytestream;

import java.io.*;
import java.util.Arrays;

public class ByteArrayStreamEx {

	public static void main(String[] args) {
		// 입력 소스
		byte[] source = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// 출력타겟
		byte[] target = null;
		
		System.out.println("입력:"+Arrays.toString(source));
		
		// ctrl shift o -> import 자동
		InputStream bis = null;
		OutputStream bos = null;
	
		try {
		// 스트림 열기
		bis = new ByteArrayInputStream(source);
		bos = new ByteArrayOutputStream();
		
		int data = 0; // 입력 스트림으로부터 넘어오는 데이터 저장
		
		while((data = bis.read()) != -1) {
			System.out.println("Read Data:"+data);
			// 출력 스트림으로 전송
			bos.write(data);
		}
		
		target = ((ByteArrayOutputStream)bos).toByteArray();
		System.out.println("출력:" + Arrays.toString(target));
		} catch (IOException e) {
			// IO 예외 처리
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
		bos.close();
		bis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("출력:"+Arrays.toString(target));
		
}
	}
