package member.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import member.service.MemberInfoService;
import member.service.MemberRegService;

public class MemberMain {

	public static void main(String[] args) {
		
		// 1. Spring 컨테이너 생성
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:appCtx.xml");
				
		
		// 2. MemberRegService 객체가 필요
		MemberRegService regService = ctx.getBean("memberRegService", MemberRegService.class);
		
		// 3. MemberRegService -> process() 실행
		regService.process();
		
		// 4. MemberInforService 객체 
		MemberInfoService infoService = ctx.getBean("memberInfoService", MemberInfoService.class);
		
		// 5. MemberInforService -> process()
		infoService.process();

	}

}
