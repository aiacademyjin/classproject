package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class StringWriter {

	public static void main(String[] args) throws IOException {
		
		// 기본 문자 스트림 
		Writer writer = new FileWriter("String.txt");
		// 필터 스트림 : BufferedWriter 기본 스트림 Writer가 필요
		BufferedWriter out = new BufferedWriter(writer);
		
		out.write("손흥민 - 메시를 멈추게 하는데 집중하겠습니다.");
		out.newLine();// 새로운 행에서 문자열을 쓰겠다.
		out.write("올시즌은 내가 최고다.");
		out.newLine();
		out.newLine();
		out.write("기사입력 완료");
		
		// 스트림 닫기
		out.close();
		
		System.out.println("기사작성 완료");

	}

}
