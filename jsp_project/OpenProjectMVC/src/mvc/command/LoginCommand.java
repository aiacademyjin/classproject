package mvc.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.service.MemberLoginService;

public class LoginCommand implements Command {

	@Override
	public String getViewPage(HttpServletRequest request, HttpServletResponse response) {
		
		// 사용자 요청에 맞는 서비스 클래스의 인스턴스 생성 -> 메소드 실행
		// 사용자 요청에 맞는 View를 선택해서 Forward
		MemberLoginService service = MemberLoginService.getInstance();
		service.memberLogin(request, response);
		
		return "/WEB-INF/view/member/loginView.jsp";
	}

}
