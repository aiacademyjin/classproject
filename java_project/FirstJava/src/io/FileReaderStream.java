package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderStream {

	public static void main(String[] args) throws IOException {
		
		char[] cbuf = new char[10];
		
		int readCnt=0;
		
		Reader in = new FileReader("paper.txt");
		
		readCnt=in.read(cbuf, 0, cbuf.length);
		
		System.out.println(new String(cbuf));
		
		in.close();

	}

}






