package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class StringReader {

	public static void main(String[] args) throws IOException {
		
		// 문자기반 기본 스트림 인스턴스 생성
		Reader reader = new FileReader("timetable.txt");
		// 필터 스트림 BufferedReader는 기본 스트림 필요
		BufferedReader in = new BufferedReader(reader);
		
		// 한행의 문자열을 담을 변수
		String str = null;
		while(true) {
			// 한줄을 읽어 문자열을 반환 : 반환할 문자열이 없으면 null 반환
			str = in.readLine();
			if(str==null) {	// 마지막라인이라면 : 더이상 가져올 문자열이 없다
				break;
			}
			str = str.replace(":", "시");
			System.out.println(str);
		}
		in.close();
	}
}
