package first;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PackageTest {

	public static void main(String[] args) {
		
		//java.util.Date today = new java.util.Date();
		Date today = new Date();
		// java.sql.Date 
		
		System.out.println(today);
		SimpleDateFormat date = null ;
		
		// yyyy -> 년도
		// MM -> 월
		// dd -> 일
		// hh -> 시간
		// mm -> 분
		// ss -> 초
		// a -> 오전 / 오후
		// 2020.10.15 10:56
		date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); 
		
		String now = date.format(today);
		
		System.out.println(now);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
