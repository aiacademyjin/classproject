package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionTest {

	public static void main(String[] args) {
		
		
		try {
			// URL 인스턴스 생성
			String urlPath = "http://www.ctware.net";
			URL url = new URL(urlPath);
			
			// URLConnection 인스턴스 
			URLConnection conn = url.openConnection();
			
			// 연결된 파일(자원)을 읽을 스트림 생성
			BufferedReader in = null;
			
			// URLConnection 인스턴스에서 InputStream 을 얻을수 있다.
			InputStream is = conn.getInputStream(); 
			
			Reader reader = new InputStreamReader(is);
			
			in = new BufferedReader(reader);
			
			// 한줄씩 읽어올 임시 변수 
			String str=null;;
			
			while(true) {
				str = in.readLine();
				if(str==null) {
					break;
				}
				System.out.println(str);
			}
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
